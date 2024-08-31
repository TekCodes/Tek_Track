package com.Tek.Track.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tek.Track.Models.JobInfo;

@Repository
public interface JobRepository extends CrudRepository<JobInfo, Long> {

    List<JobInfo> findByUserUserId(Long userId);

}
