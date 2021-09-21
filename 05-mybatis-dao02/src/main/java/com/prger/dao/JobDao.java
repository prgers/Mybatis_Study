package com.prger.dao;

import com.prger.bean.Job;

import java.util.List;

public interface JobDao {

    boolean save(Job job);
    boolean update(Job job);
    boolean remove(Integer id);
    Job get(Integer id);
    List<Job> list();

}
