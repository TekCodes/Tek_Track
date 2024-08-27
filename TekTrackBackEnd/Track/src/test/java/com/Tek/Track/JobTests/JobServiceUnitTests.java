package com.Tek.Track.JobTests;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.Tek.Track.TrackApplication;
import com.Tek.Track.Models.JobInfo;
import com.Tek.Track.Models.User;
import com.Tek.Track.Repositories.JobRepository;
import com.Tek.Track.Services.JobService;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TrackApplication.class)
public class JobServiceUnitTests {

    @MockBean
    private JobRepository jobRepository;

    @Autowired
    private JobService jobService;

    @Test
    public void whenJobIdIsProvided_thenRetrievedJobIsCorrect() {
        Long mockId = 2L;
        String mockCompany = "company";
        String mockJobTitle = "title";
        String mockJobUrl = "www.url.com";
        String mockJobDesc = "description";
        Date mockDateApplied = new Date();
        String mockContactName = "name";
        String mockContactEmail = "email@email.email";
        String mockContactNumber = "555-555-5555";
        String mockReferral = "refferal";
        Boolean mockRemote = true;
        Boolean mockResponse = true;
        User mockUser = new User(1L, "fName", "lName", "email@email.com", "userName", "password");

        JobInfo mockJobInfo = new JobInfo(mockCompany, mockJobTitle, mockJobUrl, mockJobDesc, mockDateApplied, mockContactName, mockContactEmail, mockContactNumber, mockReferral, mockRemote, mockResponse, mockUser);
        mockJobInfo.setJobInfoId(mockId);

        Mockito.when(jobRepository.findById(mockId)).thenReturn(Optional.of(mockJobInfo));

        JobInfo retrievedJobInfo = jobService.findById(mockId);

        Assert.assertNotNull(retrievedJobInfo);
        Assert.assertEquals(mockCompany, retrievedJobInfo.getCompany());
        Assert.assertEquals(mockJobTitle, retrievedJobInfo.getJobTitle());
        Assert.assertEquals(mockJobUrl, retrievedJobInfo.getJobUrlLink());
        Assert.assertEquals(mockJobDesc, retrievedJobInfo.getJobDesc());
        Assert.assertEquals(mockDateApplied, retrievedJobInfo.getDateApplied());
        Assert.assertEquals(mockContactName, retrievedJobInfo.getContactName());
        Assert.assertEquals(mockContactEmail, retrievedJobInfo.getContactEmail());
        Assert.assertEquals(mockContactNumber, retrievedJobInfo.getContactNumber());
        Assert.assertEquals(mockReferral, retrievedJobInfo.getReferral());
        Assert.assertTrue(retrievedJobInfo.getRemote());
        Assert.assertTrue(retrievedJobInfo.getGotResponse());
        Assert.assertEquals(mockUser, retrievedJobInfo.getUser());
    }

    // Test findAll method
    @Test
    public void whenFindAll_thenAllJobsAreRetrieved() {
        List<JobInfo> mockJobList = new ArrayList<>();
        mockJobList.add(new JobInfo("company1", "title1", "www.url1.com", "description1", new Date(), "name1", "email1@email.email", "555-555-5551", "referral1", true, true, new User())));
        mockJobList.add(new JobInfo("company2", "title2", "www.url2.com", "description2", new Date(), "name2", "email2@email.email", "555-555-5552", "referral2", true, true, new User())));

        Mockito.when(jobRepository.findAll()).thenReturn(mockJobList);

        List<JobInfo> retrievedJobList = jobService.findAll();

        Assert.assertNotNull(retrievedJobList);
        Assert.assertEquals(2, retrievedJobList.size());
    }

    

}
