package com.prger;

import com.prger.bean.Contact;
import com.prger.utils.Mybatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactTest {

    @Test
    public void listTest() throws Exception{
        try(SqlSession session = Mybatises.openSession()) {
            Map<String, Object> map = new HashMap<>();
            map.put("keyword", "%潘%");
            map.put("beginDay", "2021-01-01");
            map.put("endDay", "2021-06-01");
            List<Contact> list = session.selectList("contact.list", map);
            list.forEach(System.out::println);
        }

    }
}
