package com.ripplehire.solr.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ripplehire.solr.service.SolrCandService;
import com.ripplehire.solr.util.SolrUtil;

@Component
public class RHSolrClient implements CommandLineRunner {
	
	@Autowired
	private SolrCandService solrCandService;
	
	@Override
    public void run(String... args) throws Exception
    {
		runCandidateUpdatesInParallel("STANDALONE");
    }
	
	public void runCandidateUpdatesInParallel(String solrType) throws SolrServerException, IOException, InterruptedException, ExecutionException {
		
		int numOfThreads = 100;
		List<Future<Boolean>> futureList = new ArrayList<Future<Boolean>>();
		
		long startTime = System.currentTimeMillis();
		
		SolrClient solrClient = SolrUtil.getSolrClient(solrType);
		
		for (int i=0; i<numOfThreads;i++) {
			System.out.println("Calling Solr service in thread "+i);
			Future<Boolean> future = null;
			try {
				future = solrCandService.updateCandidateInSolr(solrClient);
			} catch (SolrServerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			futureList.add(future);
		}
		
		int index = 1;
		for (Future<Boolean> thread : futureList) {
			boolean executionStatus = thread.get();
			if (!executionStatus) {
				System.err.println("Thread "+index+" execution failed");
			}
			index++;
		}
		
		System.out.println("Time taken = "+((float)(System.currentTimeMillis()-startTime))/1000+"secs");
	}

}
