package com.wbq.model;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Student extends People{
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age,String guoji,String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.guoji=guoji;
        this.color=color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getGuoji(){
        return guoji;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", guoji=" + guoji +
                ", coloor=" + color +
                '}';
    }
}
