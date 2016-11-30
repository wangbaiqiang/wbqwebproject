package com.wbq;

import com.wbq.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/10/12.
 */
public class Test1 {
    public static void main(String[] args) {


//        boolean net = isNet(2);
//        System.out.print(net);
        for(int i = 0; i <10 ; ++i) {
            System.out.println("i="+i);
        }
      /*  Student s=new Student();
        if(s==null) {
            System.out.println("null");
        }else{
            System.out.println("not null");
        }*/
        /*final boolean s1 = true;
        int i=1100;
        int j=11;
        if(1000<i&&i<1200||j==10) {
            System.out.print("可以");
        }else if(i>2000) {
            System.out.print("2000");
        }

//      
        List<Student > stus=new ArrayList<Student>();
        Student stu1=new Student(323,"中医",33,"dd","djhj");
        Student stu2=new Student(323,"中医",33,"dd","djhj");
        Student stu3=new Student(323,"中医",33,"dd","djhj");
        Student stu4=new Student(323,"中医",33,"dd","djhj");
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        Map<Integer,String> m=new HashMap<Integer, String>();
        System.out.println(stus.toString());
        final boolean s2 = false;
//*/

//        name.substring(2,name.indexOf(":"));
//

    }
    public static boolean isNet(int a){
        switch (a) {
            case  1:
                System.out.print("a");
                break;
            case  2:
                System.out.print("b");
                break;
            case  3:
                System.out.print("c");
                break;
        }
        return false;
    }

}
