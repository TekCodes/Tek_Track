package Services;

import Repositories.JobRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.JobInfo;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<JobInfo> findAll() { // Method adjusted to return a list of all users
        Iterable<JobInfo> jobInfoIterable = jobRepository.findAll();
        List<JobInfo> jobInfoList = new ArrayList<>();
        jobInfoIterable.forEach(jobInfoList::add);
        return jobInfoList; 
    }

    public JobInfo findById(Long id) {
        Optional<JobInfo> optionalJobInfo = jobRepository.findById(id);

        if(optionalJobInfo.isEmpty()) {
            return null;
        }

        JobInfo jobInfo = optionalJobInfo.get();
        return jobInfo;
    }

    
}
