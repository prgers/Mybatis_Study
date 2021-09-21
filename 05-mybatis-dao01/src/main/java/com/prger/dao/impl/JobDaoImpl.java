package com.prger.dao.impl;

import com.prger.bean.Job;
import com.prger.dao.JobDao;
import com.prger.utils.Mybatises;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class JobDaoImpl implements JobDao {
    @Override
    public boolean save(Job job) {

        try(SqlSession sqlSession = Mybatises.openSession(true)) {
            return sqlSession.insert("job.save", job) > 0;
        }
    }

    @Override
    public boolean update(Job job) {
        try(SqlSession sqlSession = Mybatises.openSession(true)) {
            return sqlSession.update("job.update", job) > 0;
        }
    }

    @Override
    public boolean remove(Integer id) {
        try(SqlSession sqlSession = Mybatises.openSession(true)) {
            return sqlSession.delete("job.delete", id) > 0;
        }
    }

    @Override
    public Job get(Integer id) {
        try(SqlSession sqlSession = Mybatises.openSession()) {
            return sqlSession.selectOne("job.get", id);
        }
    }

    @Override
    public List<Job> list() {
        try(SqlSession sqlSession = Mybatises.openSession()) {
            return sqlSession.selectList("job.list");
        }
    }
}
