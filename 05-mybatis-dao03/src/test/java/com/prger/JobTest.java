package com.prger;

import com.prger.bean.Job;
import com.prger.dao.JobDao;
import com.prger.utils.Mybatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class JobTest {

    @Test
    public void listTest() {
        try (SqlSession session = Mybatises.openSession()) {
            JobDao dao = session.getMapper(JobDao.class);
            List<Job> list = dao.list();
            System.out.println(list);
        }

    }

    @Test
    public void get() {
        try (SqlSession session = Mybatises.openSession()) {
            JobDao dao = session.getMapper(JobDao.class);
            System.out.println(dao.get(1));
        }
    }

    @Test
    public void save() {
        try (SqlSession session = Mybatises.openSession(true)) {
            JobDao dao = session.getMapper(JobDao.class);
            Assert.assertTrue(dao.save(new Job("建模师", "哈哈哈")));
        }
    }

    @Test
    public void update() {
        try (SqlSession session = Mybatises.openSession(true)) {
            JobDao dao = session.getMapper(JobDao.class);
            Job job = new Job("工程师", "牛逼大佬");
            job.setId(6);
            Assert.assertTrue(dao.update(job));
        }
    }

    @Test
    public void remove() {
        try (SqlSession session = Mybatises.openSession(true)) {
            JobDao dao = session.getMapper(JobDao.class);
            Assert.assertTrue(dao.remove(5));
        }
    }
}
