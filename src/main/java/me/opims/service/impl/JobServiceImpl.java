package me.opims.service.impl;

import me.opims.dao.JobMapper;
import me.opims.model.Job;
import me.opims.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tb on 17-5-16.
 */
@Service("JobService")
public class JobServiceImpl implements JobService {

    @Resource
    private JobMapper jobMapper;

    @Override
    public List<Job> getJobsByName(String name) {
        return jobMapper.selectJobsByName(name);
    }

    @Override
    public Map<String, Object> addJob(Job job) {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", jobMapper.insertSelective(job) > 0 ? "操作成功" : "操作失败");
        return map;
    }

    @Override
    public int deletJob(Integer id) {
        return jobMapper.deleteByPrimaryKey(id);
    }
}
