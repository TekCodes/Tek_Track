package Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Models.Interview;

@Repository
public interface InterviewRepository extends CrudRepository <Interview, Long>{
    
}
