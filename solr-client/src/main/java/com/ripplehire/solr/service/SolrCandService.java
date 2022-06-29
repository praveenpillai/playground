package com.ripplehire.solr.service;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Future;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.params.CursorMarkParams;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import com.ripplehire.solr.vo.NewCandidateVO;

@Component
public class SolrCandService {	

	@Async
	public void getCandidateFromSolr(SolrClient solrClient) throws SolrServerException, IOException {

		int companyMstrSeq=2;
		int jobSeq=23846;
		
		SolrQuery query = new SolrQuery();
        query.setQuery("*:*");
        query.addFilterQuery("JOB_SEQ:" + jobSeq);
        query.addFilterQuery("COMPANY_MSTR_SEQ:" + companyMstrSeq);
        query.setRows(500);
        query.addSort("EMPL_REFRL_SEQ", SolrQuery.ORDER.asc);
        String cursorMark = CursorMarkParams.CURSOR_MARK_START;
        query.set(CursorMarkParams.CURSOR_MARK_PARAM, cursorMark);
        System.out.println("Querying Solr...");
        QueryResponse response = solrClient.query(query);
        System.out.println("Response received from Solr");
        List<NewCandidateVO> candidateslist = response.getBeans(NewCandidateVO.class);
        System.out.println("Number of candidates = "+candidateslist.size());
        for (NewCandidateVO candidateVO : candidateslist) {
        	System.out.println("Candidate Name: "+candidateVO.getFullName());
        }
    }
	
	@Async
	public Future<Boolean> updateCandidateInSolr(SolrClient solrClient) throws SolrServerException, IOException {
		
		int companyMstrSeq=2;
		
		List<NewCandidateVO> newCandidateVOList = new ArrayList<NewCandidateVO>();
		NewCandidateVO newCandidateVO = createDummyCandidate(companyMstrSeq);
		newCandidateVOList.add(newCandidateVO);
		
		solrClient.addBeans(newCandidateVOList);
		System.out.println("Updating Candidate in Solr Cloud...");
		solrClient.commit();
		System.out.println("Commit done");
		return new AsyncResult<Boolean>(true);
	}

	private NewCandidateVO createDummyCandidate(int companyMstrSeq) {
		NewCandidateVO newCandidateVO = new NewCandidateVO();
		newCandidateVO.setCompanySeq(companyMstrSeq);
		newCandidateVO.setRipplehireSequence("RHTEMP"+getUniqueID());
		newCandidateVO.setEmplRefrlSeq(String.valueOf(randomNumber(5)));
		newCandidateVO.setActionUpdateDttm(new Date());
		newCandidateVO.setAgencyEmailId(randomEmail(15));
		newCandidateVO.setAgencyPhoneNo(String.valueOf(randomNumber(10)));
		newCandidateVO.setAlternateEmail(randomEmail(15));
		newCandidateVO.setApplyDate(new Date());
		newCandidateVO.setCampaignSeq(null);
		newCandidateVO.setChannel(randomName(20));
		newCandidateVO.setClientCandidateID(randomName(10));
		newCandidateVO.setContestSeq(getUniqueID());
		newCandidateVO.setCreateDttm(new Date());
		newCandidateVO.setCurrentCTC(null);
		newCandidateVO.setCurrentEmployee(randomName(25));
		newCandidateVO.setCurrentLocation(randomName(15));
		newCandidateVO.setCurrentPassion(randomName(50));
		newCandidateVO.setDisplayAvailable(false);
		newCandidateVO.setDocumentRequestStatus(null);
		newCandidateVO.setEducationalDetails(null);
		newCandidateVO.setEmailAddr(randomEmail(20));
		newCandidateVO.setEmployerOther(randomName(20));
		newCandidateVO.setEndTimeScheduled(new Date());
		newCandidateVO.setExpectedCTC(null);
		newCandidateVO.setExpYears(10);
		newCandidateVO.setFetchedSize(5);
		newCandidateVO.setFirstName(randomName(10));
		newCandidateVO.setFullName(randomName(20));
		newCandidateVO.setGender("M");
		//newCandidateVO.setInterviewStageSeq(1);
		newCandidateVO.setInterviewStatus("DONE");
		newCandidateVO.setInterviewStatusCd("D");
		newCandidateVO.setIsFakeEmployer("N");
		newCandidateVO.setIsFakeQualification("N");
		newCandidateVO.setIsFeedbackDone("N");
		newCandidateVO.setIsFeedbackReviewCompleted("N");
		newCandidateVO.setIsReviewDone("N");
		newCandidateVO.setJobStatus("Open");
		newCandidateVO.setJobTitle(randomName(50));
		newCandidateVO.setJoiningDate(new Date());
		newCandidateVO.setLandlineNo(String.valueOf(randomNumber(10)));
		newCandidateVO.setLastName(randomName(10));
		newCandidateVO.setLifeCycleState(1);
		newCandidateVO.setMiddleName(randomName(20));
		newCandidateVO.setNoticePeriod(1);
		newCandidateVO.setOtherQualification(randomName(100));
		newCandidateVO.setPassionDetails(null);
		newCandidateVO.setPersonalDetails(null);
		newCandidateVO.setPhoneNo(String.valueOf(randomNumber(10)));
		newCandidateVO.setPreviousRound("Prev");
		newCandidateVO.setProfessionalDetails(null);
		newCandidateVO.setQualification(randomName(100));
		newCandidateVO.setReapplyDate(new Date());
		newCandidateVO.setRecruiters(null);
		newCandidateVO.setRehireStatus("N");
		newCandidateVO.setRelevantExpYears(1);
		newCandidateVO.setResumeData(randomName(100));
		newCandidateVO.setResumeUpdateDttm(new Date());
		newCandidateVO.setScheduled("Y");
		newCandidateVO.setShowActionPanel("N");
		newCandidateVO.setSkills(randomName(25));
		newCandidateVO.setSkillsDesc(null);
		newCandidateVO.setSourceEmail(randomEmail(15));
		newCandidateVO.setSourceId(randomName(5));
		newCandidateVO.setSubstatus(randomName(5));
		newCandidateVO.setUserProfileSeq((int)randomNumber(5));
		newCandidateVO.setWebpresence(null);
		//newCandidateVO.setYetToAction("N");
		return newCandidateVO;
	}
	
	private int getUniqueID() {
		return new Random().nextInt(100)+1;
	}
	
	public static String randomName(int length) {
		
		char[] characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ".toCharArray();
	    return getRandomString(length, characterSet);
	}
	
	public static String randomEmail(int length) {
		
		char[] characterSet = "abcdefghijklmnopqrstuvwxyz0123456789@-".toCharArray();
	    return getRandomString(length, characterSet)+"@"+getRandomString(length, characterSet)+".com";
	}
	
	public static long randomNumber(int length) {
		
		char[] characterSet = "0123456789".toCharArray();
	    return Long.parseLong(getRandomString(length, characterSet));
	}
	
	private static String getRandomString(int length, char[] characterSet) {
		Random random = new SecureRandom();
	    char[] result = new char[length];
	    for (int i = 0; i < result.length; i++) {
	        // picks a random index out of character set > random character
	        int randomCharIndex = random.nextInt(characterSet.length);
	        result[i] = characterSet[randomCharIndex];
	    }
	    return new String(result);
	}

}
