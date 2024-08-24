package com.Tek.Track.JobTests;

import java.util.Date;

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

    
}
