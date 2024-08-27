package com.Tek.Track.JobTests;

import java.util.Date;
import java.util.Optional;

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
        String mockRefferal = "refferal";
        Boolean mockRemote = true;
        Boolean mockResponse = true;
        User mockUser = new User(1L, "fName", "lName", "email@email.com", "userName", "password");

        JobInfo mockJobInfo = new JobInfo(mockCompany, mockJobTitle, mockJobUrl, mockJobDesc, mockDateApplied, mockContactName, mockContactEmail, mockContactNumber, mockRefferal, mockRemote, mockResponse, mockUser);
        mockJobInfo.setJobInfoId(mockId);

        Mockito.when(jobRepository.findById(mockId)).thenReturn(Optional.of(mockJobInfo));

        JobInfo retrievedJobInfo = jobService.findById(mockId);

        
    }

}
