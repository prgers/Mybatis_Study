package com.prger;

import com.prger.bean.BankCard;
import com.prger.bean.IdCard;
import com.prger.bean.Person;
import com.prger.utils.Mybatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class OneToMany {

    @Test
    public void personListTest() {
        try(SqlSession session = Mybatises.openSession()) {
            List<Person> list = session.selectList("person.list");
            list.forEach(System.out::println);
        }
    }

    @Test
    public void bankCardListTest() {
        try(SqlSession session = Mybatises.openSession()) {
            List<BankCard> list = session.selectList("bankCard.list");
            list.forEach(System.out::println);
        }
    }
    @Test
    public void bankCardGetTest() {
        try(SqlSession session = Mybatises.openSession()) {
            BankCard bankCard = session.selectOne("bankCard.get", 1);
            System.out.println(bankCard);
        }
    }

}
