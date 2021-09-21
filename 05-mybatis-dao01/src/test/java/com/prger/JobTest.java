package com.prger;

import com.prger.bean.Job;
import com.prger.dao.JobDao;
import com.prger.dao.impl.JobDaoImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class JobTest {

    @Test
    public void listTest() {
        JobDao dao = new JobDaoImpl();
        List<Job> list = dao.list();
        System.out.println(list);
    }

    @Test
    public void get() {
        JobDao dao = new JobDaoImpl();
        System.out.println(dao.get(1));
    }

    @Test
    public void save() {
        JobDao dao = new JobDaoImpl();
        Assert.assertTrue(dao.save(new Job("老板", "当老板，赚大钱")));
    }

    @Test
    public void update() {
        JobDao dao = new JobDaoImpl();
        Job job = new Job("技术总监", "牛逼大佬");
        job.setId(5);
        Assert.assertTrue(dao.update(job));
    }

    @Test
    public void remove() {
        JobDao dao = new JobDaoImpl();
        Assert.assertTrue(dao.remove(7));
    }
}
