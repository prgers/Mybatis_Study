package com.prger.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class Mybatises {

    private static SqlSessionFactory factory;

    static {
        try(Reader reader = Resources.getResourceAsReader("mybatis-config.xml")){
            factory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSession() {
        return factory.openSession();
    }

    public static SqlSession openSession(boolean autoCommit) {
        return  factory.openSession(autoCommit);
    }
}
