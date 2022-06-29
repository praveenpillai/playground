package com.ripplehire.solr.util;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

public class SolrUtil {
	
	public static SolrClient getSolrClient(String solrType) throws SolrServerException, IOException {
		
		SolrClient solrClient = null;
		if ("STANDALONE".equals(solrType)) {
			String solrUrl = "http://qaserv.ripplehire.com:8983/solr/";
			String solrCollectionName = "buddyto-candidate";
			solrClient= new HttpSolrClient.Builder(solrUrl+solrCollectionName).build();
			
		} else if ("CLOUD".equals(solrType)) {
			String zkHosts = "solrnew.ripplehire.com:9983";
			String solrCollectionName = "sanity_candidate";
			solrClient =  new CloudSolrClient.Builder().withZkHost(zkHosts).build();
			((CloudSolrClient)solrClient).setDefaultCollection(solrCollectionName);
		}
		return solrClient;
	}
}
