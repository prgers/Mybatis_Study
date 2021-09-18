package com.prger;

import com.prger.bean.Job;
import com.prger.bean.Person;
import com.prger.utils.Mybatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ManyToMany {

    @Test
    public void personListTest() {
        try(SqlSession session = Mybatises.openSession()) {
            List<Person> list = session.selectList("person.list");
            list.forEach(System.out::println);
        }
    }

    @Test
    public void personGetTest() {
        try(SqlSession session = Mybatises.openSession()) {
            Person person = session.selectOne("person.get", 1);
            System.out.println(person);
        }
    }

    @Test
    public void jobListTest() {
        try(SqlSession session = Mybatises.openSession()) {
            List<Job> list = session.selectList("job.list");
            list.forEach(System.out::println);
        }
    }

}
