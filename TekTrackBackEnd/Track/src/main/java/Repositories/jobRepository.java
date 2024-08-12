package Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Models.jobInfo;

@Repository
public interface JobRepository extends CrudRepository<Long, jobInfo> {

}
