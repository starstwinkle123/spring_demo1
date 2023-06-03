package com.liwenjie.pojo;

import javax.naming.Name;
import java.util.*;

public class Student {
    public String name;
    public Address address;
    public String[] books;
    public List<String> hobbys;
    public Map<String, String> card;
    public Set<String> games;
    public String wife;
    public Properties info;//Properties 类常用于存储程序的配置信息，例如数据库连接信息、日志输出配置、应用程序设置等

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public void show() {
        System.out.println("name=" + name
                + ",address" + address.getAddress()
                +",books:");
        for(String book:books){
            System.out.println("<<"+book+">>");
        }
        System.out.println("爱好:"+hobbys);
        System.out.println("card:"+card);
        System.out.println("games:"+games);
        System.out.println("wife:"+wife);
        System.out.println("info:"+info);
    }

}
