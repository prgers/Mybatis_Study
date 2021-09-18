package com.prger;

import com.github.pagehelper.PageHelper;
import com.prger.bean.Skill;
import com.prger.utils.Mybatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SkillTest {

    @Test
    public void select() throws Exception {
        try(SqlSession session = Mybatises.openSession(true)) {
            //执行SQL语句
            List<Skill> list = session.selectList("skill.list");
            for (Skill skill : list) {
                System.out.println(skill);
            }
        }
    }

    @Test
    public void select2() throws Exception {
        try(SqlSession session = Mybatises.openSession(true)) {
            //执行SQL语句
            PageHelper.startPage(2, 3);
            List<Skill> list = session.selectList("skill.list");
            for (Skill skill : list) {
                System.out.println(skill);
            }
        }
    }

    @Test
    public void getTest() throws Exception {
        try(SqlSession session = Mybatises.openSession()) {

            Skill skill = session.selectOne("skill.get", 6);
            System.out.println(skill);

        }
    }

    @Test
    public void list() throws Exception {
        try(SqlSession session = Mybatises.openSession()) {

            Skill skill = new Skill("%M%", 1);
            List<Skill> list = session.selectList("skill.list2", skill);

            list.forEach(System.out::println);

        }
    }

    @Test
    public void insert() throws Exception {
        try(SqlSession session = Mybatises.openSession(true)) {
            Skill skill = new Skill("iOS", 1);
            session.insert("skill.insert", skill);
        }
    }

    @Test
    public void insert2() throws Exception {
        try(SqlSession session = Mybatises.openSession(true)) {
            Skill skill = new Skill("Android", 2);
            session.insert("skill.insert2", skill);
            System.out.println(skill.getId());
        }
    }

    @Test
    public void insert3() throws Exception {
        try(SqlSession session = Mybatises.openSession(true)) {
            Skill skill = new Skill("Android", 2);
            session.insert("skill.insert3", skill);
            System.out.println(skill.getId());
        }
    }

    @Test
    public void update() throws Exception {
        try(SqlSession session = Mybatises.openSession(true)) {
            Skill skill = session.selectOne("skill.get", 6);
            skill.setLevel(100);
            skill.setName("GO");
            session.update("skill.update", skill);
        }
    }

    @Test
    public void delete() throws Exception {
        try(SqlSession session = Mybatises.openSession(true)) {
            session.delete("skill.delete", 6);
        }
    }

    @Test
    public void batchAdd() throws Exception {
        try(SqlSession session = Mybatises.openSession(true)) {
            List<Skill> skills = new ArrayList<>();
            skills.add(new Skill("Python", 20));
            skills.add(new Skill(".NET", 60));

            session.insert("skill.batchAdd", skills);
        }
    }

    @Test
    public void batchAdd2() throws Exception {
        try(SqlSession session = Mybatises.openSession(true)) {
            List<Skill> skills = new ArrayList<>();
            skills.add(new Skill("Python", 20));
            skills.add(new Skill(".NET", 60));

            session.insert("skill.batchAdd2", skills);

            for (Skill skill : skills) {
                System.out.println(skill.getId());
            }
        }
    }

    @Test
    public void batchDelete() throws Exception {
        try(SqlSession session = Mybatises.openSession(true)) {
            List<Integer> ids = new ArrayList<>();
            ids.add(13);
            ids.add(14);
            session.insert("skill.batchDelete", ids);
        }
    }


}
