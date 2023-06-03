package com.liwenjie.pojo;

public class User {
    private String name;
    private int age;

    public User() {
        System.out.println("无参构造");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("我的name"+name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
