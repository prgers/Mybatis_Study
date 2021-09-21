package com.prger.dao;

import com.prger.bean.Job;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface JobDao {

    @Insert("INSERT INTO job(name, duty) VALUES(#{name}, #{duty})")
    boolean save(Job job);
    @Update("UPDATE job SET name = #{name}, duty = #{duty} WHERE id = #{id}")
    boolean update(Job job);
    @Delete("DELETE job WHERE id = #{id}")
    boolean remove(Integer id);
    @Select("SELECT * FROM job WHERE id = #{id}")
    Job get(Integer id);
    @Select("SELECT * FROM job")
    List<Job> list();

}
