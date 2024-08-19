package Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import Repositories.InterviewRepository;;

@Service
public class InterviewService {

    @Autowired
    private InterviewRepository interviewRepository;

    public InterviewService(InterviewRepository interviewRepository) {
        this.interviewRepository = interviewRepository;
    }


}
