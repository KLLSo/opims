package me.opims.service;

import me.opims.model.Job;

import java.util.List;
import java.util.Map;

/**
 * Created by tb on 17-5-16.
 */
public interface JobService {

    List<Job> getJobsByName(String name);

    Map<String,Object> addJob(Job job);

    int deletJob(Integer id);
}
