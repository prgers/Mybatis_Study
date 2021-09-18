package com.prger;

import com.prger.bean.IdCard;
import com.prger.bean.Person;
import com.prger.utils.Mybatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class OneToOne {

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
    public void idCardListTest() {
        try(SqlSession session = Mybatises.openSession()) {
            List<IdCard> list = session.selectList("idCard.list");
            list.forEach(System.out::println);
        }
    }
    @Test
    public void idCardGetTest() {
        try(SqlSession session = Mybatises.openSession()) {
            IdCard idCard = session.selectOne("idCard.get", 1);
            System.out.println(idCard);
        }
    }
}
