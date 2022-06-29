
package com.ripplehire.solr.vo;


import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.beans.Field;

import com.ripplehire.solr.constants.ApplicationConstants;

public class NewCandidateVO implements Serializable {

    private Map<String, String> personalDetails = new HashMap<String, String>();
    private Map<String, String> professionalDetails = new HashMap<String, String>();
    private Map<String, String> addressDetails = new HashMap<String, String>();
    private Map<String, String> passionDetails = new HashMap<String, String>();
    private Map<String, String> webpresence = new HashMap<String, String>();
    private Map<String, String> educationalDetails = new HashMap<String, String>();
    private Integer fetchedSize;
    private Integer count;
    private boolean displayAvailable = true;
    private String alternateEmail;
    private String showActionPanel;
    private String isFeedbackReviewCompleted;
    private String rehireStatus;

    @Field(ApplicationConstants.EMPL_REFRL_SEQ)
    private String emplRefrlSeq;

    @Field(ApplicationConstants.RH_SEQ)
    private String ripplehireSequence;

    @Field(ApplicationConstants.COMPANY_MSTR_SEQ)
    private Integer companySeq;

    @Field(ApplicationConstants.CLIENT_CANDIDATE_ID)
    private String clientCandidateID;

    @Field(ApplicationConstants.JOB_SEQ)
    private Integer jobSeq;

    @Field(ApplicationConstants.JOB_TITLE)
    private String jobTitle;

    @Field(ApplicationConstants.SOLR_CAND_FIRST_NAME)
    private String firstName;

    @Field(ApplicationConstants.SOLR_CAND_LAST_NAME)
    private String lastName;

    @Field(ApplicationConstants.SOLR_CAND_MIDDLE_NAME)
    private String middleName;

    @Field(ApplicationConstants.SOLR_CAND_FULL_NAME)
    private String fullName;

    @Field(ApplicationConstants.CAND_EMAIL_ADDR)
    private String emailAddr;

    @Field(ApplicationConstants.CAND_PHONE_NO)
    private String phoneNo;

    @Field(ApplicationConstants.CAND_LANDLINE_NO)
    private String landlineNo;

    @Field(ApplicationConstants.SKILLS)
    private String skills;

    @Field(ApplicationConstants.YEARS_TOTAL_EXP)
    private Integer expYears;

    @Field(ApplicationConstants.YEARS_RELEVANT_EXP)
    private Integer relevantExpYears;

    @Field(ApplicationConstants.CURRENT_CTC)
    private Long currentCTC;

    @Field(ApplicationConstants.EXPECTED_CTC)
    private Long expectedCTC;

    @Field(ApplicationConstants.NOTICE_PERIOD)
    private Integer noticePeriod;

    @Field(ApplicationConstants.QUALIFICATION_DESC)
    private String qualification;

    @Field(ApplicationConstants.OTHER_QUALIFICATION)
    private String otherQualification;

    @Field(ApplicationConstants.GENDER_DESC)
    private String gender;

    @Field(ApplicationConstants.CURRENT_EMPLOYER_DESC)
    private String currentEmployee;

    @Field(ApplicationConstants.OTHER_EMPLOYER)
    private String employerOther;

    @Field(ApplicationConstants.SKILLS_DESC)
    private List<String> skillsDesc;

    @Field(ApplicationConstants.CURRENT_LOCATION_DESC)
    private String currentLocation;

    @Field(ApplicationConstants.PASSION)
    private String currentPassion;

    @Field(ApplicationConstants.STAGE_DESC)
    private String interviewStatus;

    @Field(ApplicationConstants.REFRL_STATUS_CD)
    private String interviewStatusCd;

    @Field(ApplicationConstants.INTERVIEW_STAGE_SEQ)
    private Integer interviewStageSeq;

    @Field(ApplicationConstants.APPLY_DATE)
    private Date applyDate;

    @Field(ApplicationConstants.RESUME_UPDATE_DTTM)
    private Date resumeUpdateDttm;

    @Field(ApplicationConstants.CONTEST_SEQ)
    private Integer contestSeq;

    @Field(ApplicationConstants.CAMPAIGN_SEQ)
    private List<Integer> campaignSeq;

    @Field(ApplicationConstants.CREATE_DTTM)
    private Date createDttm;

    @Field(ApplicationConstants.RESUME_DATA)
    private String resumeData;

    @Field(ApplicationConstants.IS_FAKE_EMPLOYER)
    private String isFakeEmployer;

    @Field(ApplicationConstants.IS_FAKE_QUALIFICATION)
    private String isFakeQualification;

    @Field(ApplicationConstants.SOLR_CHANNEL)
    private String channel;

    @Field(ApplicationConstants.SOLR_USER_PROFILE_SEQ)
    private Integer userProfileSeq;

    @Field(ApplicationConstants.ACTION_UPDATE_DTTM)
    private Date actionUpdateDttm;

    @Field(ApplicationConstants.AGENCY_EMAIL_ID)
    private String agencyEmailId;

    @Field(ApplicationConstants.AGENCY_PHONE_NO)
    private String agencyPhoneNo;

    @Field(ApplicationConstants.RECRUITERS)
    private List<Integer> recruiters;

    @Field(ApplicationConstants.RE_APPLY_DTTM)
    private Date reapplyDate;

    @Field(ApplicationConstants.PREVIOUS_ROUND)
    private String previousRound;

    @Field(ApplicationConstants.SCHEDULED)
    private String scheduled;

    @Field(ApplicationConstants.IS_REVIEW_DONE)
    private String isReviewDone;

    @Field(ApplicationConstants.IS_FEEDBACK_DONE)
    private String isFeedbackDone;

    @Field(ApplicationConstants.END_TIME_SCHEDULED)
    private Date endTimeScheduled;

    @Field(ApplicationConstants.SOLR_LIFE_CYCLE_STATE)
    private Integer lifeCycleState;

    @Field(ApplicationConstants.SOLR_SOURCE_ID)
    private String sourceId;

    @Field(ApplicationConstants.SOLR_SOURCE_EMAIL)
    private String sourceEmail;

    @Field(ApplicationConstants.SOLR_JOINING_DATE)
    private Date joiningDate;

    @Field(ApplicationConstants.SOLR_FACET_JOB_STATUS)
    private String jobStatus;

    @Field(ApplicationConstants.SUBSTATUS)
    private String substatus;

    @Field(ApplicationConstants.DOCUMENT_REQUEST_STATUS)
    private List<String> documentRequestStatus;

    @Field(ApplicationConstants.YET_TO_ACTION)
    private String yetToAction;

    @Field(ApplicationConstants.INTEGRATION_REQUEST_STATUS)
    private List<String> integrationRequestStatus;

    public String getEmplRefrlSeq() {
        return emplRefrlSeq;
    }

    public void setEmplRefrlSeq(String emplRefrlSeq) {
        this.emplRefrlSeq = emplRefrlSeq;
    }

    public String getRipplehireSequence() {
        return ripplehireSequence;
    }

    public void setRipplehireSequence(String ripplehireSequence) {
        this.ripplehireSequence = ripplehireSequence;
    }

    public Integer getCompanySeq() {
        return companySeq;
    }

    public void setCompanySeq(Integer companySeq) {
        this.companySeq = companySeq;
    }

    public String getClientCandidateID() {
        return clientCandidateID;
    }

    public void setClientCandidateID(String clientCandidateID) {
        this.clientCandidateID = clientCandidateID;
    }

    public Integer getJobSeq() {
        return jobSeq;
    }

    public void setJobSeq(Integer jobSeq) {
        this.jobSeq = jobSeq;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLandlineNo() {
        return landlineNo;
    }

    public void setLandlineNo(String landlineNo) {
        this.landlineNo = landlineNo;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Integer getExpYears() {
        return expYears;
    }

    public void setExpYears(Integer expYears) {
        this.expYears = expYears;
    }

    public Integer getRelevantExpYears() {
        return relevantExpYears;
    }

    public void setRelevantExpYears(Integer relevantExpYears) {
        this.relevantExpYears = relevantExpYears;
    }

    public Long getCurrentCTC() {
        return currentCTC;
    }

    public void setCurrentCTC(Long currentCTC) {
        this.currentCTC = currentCTC;
    }

    public Long getExpectedCTC() {
        return expectedCTC;
    }

    public void setExpectedCTC(Long expectedCTC) {
        this.expectedCTC = expectedCTC;
    }

    public Integer getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(Integer noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getOtherQualification() {
        return otherQualification;
    }

    public void setOtherQualification(String otherQualification) {
        this.otherQualification = otherQualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCurrentEmployee() {
        return currentEmployee;
    }

    public void setCurrentEmployee(String currentEmployee) {
        this.currentEmployee = currentEmployee;
    }

    public String getEmployerOther() {
        return employerOther;
    }

    public void setEmployerOther(String employerOther) {
        this.employerOther = employerOther;
    }

    public List<String> getSkillsDesc() {
        return skillsDesc;
    }

    public void setSkillsDesc(List<String> skillsDesc) {
        this.skillsDesc = skillsDesc;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getCurrentPassion() {
        return currentPassion;
    }

    public void setCurrentPassion(String currentPassion) {
        this.currentPassion = currentPassion;
    }

    public String getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(String interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    public String getInterviewStatusCd() {
        return interviewStatusCd;
    }

    public void setInterviewStatusCd(String interviewStatusCd) {
        this.interviewStatusCd = interviewStatusCd;
    }

    public Integer getInterviewStageSeq() {
        return interviewStageSeq;
    }

    public void setInterviewStageSeq(Integer interviewStageSeq) {
        this.interviewStageSeq = interviewStageSeq;
    }

    public Integer getContestSeq() {
        return contestSeq;
    }

    public void setContestSeq(Integer contestSeq) {
        this.contestSeq = contestSeq;
    }

    public List<Integer> getCampaignSeq() {
        return campaignSeq;
    }

    public void setCampaignSeq(List<Integer> campaignSeq) {
        this.campaignSeq = campaignSeq;
    }

    public Date getCreateDttm() {
        return createDttm;
    }

    public void setCreateDttm(Date createDttm) {
        this.createDttm = createDttm;
    }

    public String getResumeData() {
        return resumeData;
    }

    public void setResumeData(String resumeData) {
        this.resumeData = resumeData;
    }


    public Map<String, String> getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(Map<String, String> personalDetails) {
        this.personalDetails = personalDetails;
    }

    public Map<String, String> getProfessionalDetails() {
        return professionalDetails;
    }

    public void setProfessionalDetails(Map<String, String> professionalDetails) {
        this.professionalDetails = professionalDetails;
    }

    public Map<String, String> getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(Map<String, String> addressDetails) {
        this.addressDetails = addressDetails;
    }

    public Map<String, String> getPassionDetails() {
        return passionDetails;
    }

    public void setPassionDetails(Map<String, String> passionDetails) {
        this.passionDetails = passionDetails;
    }

    public Map<String, String> getWebpresence() {
        return webpresence;
    }

    public void setWebpresence(Map<String, String> webpresence) {
        this.webpresence = webpresence;
    }

    public Map<String, String> getEducationalDetails() {
        return educationalDetails;
    }

    public void setEducationalDetails(Map<String, String> educationalDetails) {
        this.educationalDetails = educationalDetails;
    }

    public Integer getFetchedSize() {
        return fetchedSize;
    }

    public void setFetchedSize(Integer fetchedSize) {
        this.fetchedSize = fetchedSize;
    }

    public String getIsFakeQualification() {
        return isFakeQualification;
    }

    public void setIsFakeQualification(String isFakeQualification) {
        this.isFakeQualification = isFakeQualification;
    }

    public String getIsFakeEmployer() {
        return isFakeEmployer;
    }

    public void setIsFakeEmployer(String isFakeEmployer) {
        this.isFakeEmployer = isFakeEmployer;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getResumeUpdateDttm() {
        return resumeUpdateDttm;
    }

    public void setResumeUpdateDttm(Date resumeUpdateDttm) {
        this.resumeUpdateDttm = resumeUpdateDttm;
    }

    public Integer getUserProfileSeq() {
        return userProfileSeq;
    }

    public void setUserProfileSeq(Integer userProfileSeq) {
        this.userProfileSeq = userProfileSeq;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Date getActionUpdateDttm() {
        return actionUpdateDttm;
    }

    public void setActionUpdateDttm(Date actionUpdateDttm) {
        this.actionUpdateDttm = actionUpdateDttm;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public boolean isDisplayAvailable() {
        return displayAvailable;
    }

    public void setDisplayAvailable(boolean displayAvailable) {
        this.displayAvailable = displayAvailable;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getAgencyEmailId() {
        return agencyEmailId;
    }

    public void setAgencyEmailId(String agencyEmailId) {
        this.agencyEmailId = agencyEmailId;
    }

    public String getAgencyPhoneNo() {
        return agencyPhoneNo;
    }

    public void setAgencyPhoneNo(String agencyPhoneNo) {
        this.agencyPhoneNo = agencyPhoneNo;
    }

    public List<Integer> getRecruiters() {
        return recruiters;
    }

    public void setRecruiters(List<Integer> recruiters) {
        this.recruiters = recruiters;
    }

    /*showActionPanel(7-bits)
     	1. accept panel
     	2. move panel
     	3. invite panel
     	4. edit panel
     	5. joinDate panel
     	6. sourceChange panel
     	7. scheduledFilter panel

     	1-on
     	0-off*/

    public String getShowActionPanel() {
        return showActionPanel;
    }

    public void setShowActionPanel(String showActionPanel) {
        this.showActionPanel = showActionPanel;
    }

    public Date getReapplyDate() {
        return reapplyDate;
    }

    public void setReapplyDate(Date reapplyDate) {
        this.reapplyDate = reapplyDate;
    }

    public String getPreviousRound() {
        return previousRound;
    }

    public void setPreviousRound(String previousRound) {
        this.previousRound = previousRound;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public Date getEndTimeScheduled() {
        return endTimeScheduled;
    }

    public void setEndTimeScheduled(Date endTimeScheduled) {
        this.endTimeScheduled = endTimeScheduled;
    }

    public String getIsReviewDone() {
        return isReviewDone;
    }

    public void setIsReviewDone(String isReviewDone) {
        this.isReviewDone = isReviewDone;
    }

    public String getIsFeedbackDone() {
        return isFeedbackDone;
    }

    public void setIsFeedbackDone(String isFeedbackDone) {
        this.isFeedbackDone = isFeedbackDone;
    }

    public String getIsFeedbackReviewCompleted() {
        return isFeedbackReviewCompleted;
    }

    public void setIsFeedbackReviewCompleted(String isFeedbackReviewCompleted) {
        this.isFeedbackReviewCompleted = isFeedbackReviewCompleted;
    }

    public Integer getLifeCycleState() {
        return lifeCycleState;
    }

    public void setLifeCycleState(Integer lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceEmail() {
        return sourceEmail;
    }

    public void setSourceEmail(String sourceEmail) {
        this.sourceEmail = sourceEmail;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getRehireStatus() {
        return rehireStatus;
    }

    public void setRehireStatus(String rehireStatus) {
        this.rehireStatus = rehireStatus;
    }

    public String getSubstatus() {
        return substatus;
    }

    public void setSubstatus(String substatus) {
        this.substatus = substatus;
    }

    public List<String> getDocumentRequestStatus() {
        return documentRequestStatus;
    }

    public void setDocumentRequestStatus(List<String> documentRequestStatus) {
        this.documentRequestStatus = documentRequestStatus;
    }
    public String getYetToAction() {
        return yetToAction;
    }

    public void setYetToAction(String yetToAction) {
        this.yetToAction = yetToAction;
    }

    public List<String> getIntegrationRequestStatus() {
        return integrationRequestStatus;
    }

    public void setIntegrationRequestStatus(List<String> integrationRequestStatus) {
        this.integrationRequestStatus = integrationRequestStatus;
    }
}
