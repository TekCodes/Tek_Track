package com.Tek.Track.JobTests;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Models.JobInfo;
import Models.User;

public class JobModelUnitTests {

    private JobInfo jobInfo;
    private JobInfo identicalJobInfo;
    private JobInfo differentJobInfo;

    @Before
    public void setUp() {
        User user = new User();
        Date dateApplied = new Date();

        jobInfo = new JobInfo(1L, "Company", "Job Title", "http://joblink.com", "Job Description", dateApplied, "Contact Name", "contact@example.com", "1234567890", "Referral Name", true, true, user);

        identicalJobInfo = new JobInfo(1L, "Company", "Job Title", "http://joblink.com", "Job Description", dateApplied, "Contact Name", "contact@example.com", "1234567890", "Referral Name", true, true, user);

        differentJobInfo = new JobInfo(2L, "Different Company", "Different Job Title", "http://differentjoblink.com", "Different Job Description", new Date(), "Different Contact Name", "different@example.com", "0987654321", "Different Referral Name", false, false, user);
    }

    @Test
    public void testGettersAndSetters() {
        User user = new User();
        Date dateApplied = new Date();

        jobInfo.setJobInfoId(2L);
        jobInfo.setCompany("Different Company");
        jobInfo.setJobTitle("Different Job Title");
        jobInfo.setJobUrlLink("http://differentjoblink.com");
        jobInfo.setJobDesc("Different Job Description");
        jobInfo.setDateApplied(dateApplied);
        jobInfo.setContactName("Different Contact Name");
        jobInfo.setContactEmail("different@example.com");
        jobInfo.setContactNumber("0987654321");
        jobInfo.setReferral("Different Referral Name");
        jobInfo.setRemote(false);
        jobInfo.setGotResponse(false);
        jobInfo.setUser(user);

        Assert.assertEquals(2L, jobInfo.getJobInfoId());
        Assert.assertEquals("Different Company", jobInfo.getCompany());
        Assert.assertEquals("Different Job Title", jobInfo.getJobTitle());
        Assert.assertEquals("http://differentjoblink.com", jobInfo.getJobUrlLink());
        Assert.assertEquals("Different Job Description", jobInfo.getJobDesc());
        Assert.assertEquals(dateApplied, jobInfo.getDateApplied());
        Assert.assertEquals("Different Contact Name", jobInfo.getContactName());
        Assert.assertEquals("different@example.com", jobInfo.getContactEmail());
        Assert.assertEquals("0987654321", jobInfo.getContactNumber());
        Assert.assertEquals("Different Referral Name", jobInfo.getReferral());
        Assert.assertEquals(false, jobInfo.getRemote());
        Assert.assertEquals(false, jobInfo.getGotResponse());
        Assert.assertEquals(user, jobInfo.getUser());
    }

    
}
