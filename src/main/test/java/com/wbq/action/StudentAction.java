package com.wbq.action;

import com.wbq.dao.StudentDao;
import com.wbq.model.Student;

import java.util.List;

/**
 * Created by Administrator on 2016/10/10.
 */
public class StudentAction {
    public static void main(String[] args) {
        StudentDao dao=new StudentDao();
        try {
            List<Student> students = dao.query();
            for (Student student : students) {
                System.out.println(student.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
