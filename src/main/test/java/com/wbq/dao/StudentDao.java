package com.wbq.dao;

import com.wbq.db.DBUtils;
import com.wbq.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/10.
 */
public class StudentDao {
    public void addStudent(){
        Connection conn = DBUtils.getConnection();
    }
    public void updateStudent(){

    }
    public void deleteStudent(){

    }
    public List<Student> query() throws Exception {
        Connection conn = DBUtils.getConnection();
        //3.操作数据库
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT name,age FROM students");
        List<Student> students=new ArrayList<Student>();
        Student student=null;
        while(rs.next()) {
            student=new Student();
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            students.add(student);
        }
        return students;
    }
    public Student getStudent(){
        return null;
    }


    }
