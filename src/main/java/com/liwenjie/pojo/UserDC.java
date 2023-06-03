package com.liwenjie.pojo;

import com.liwenjie.pojo.Cat;
import com.liwenjie.pojo.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class UserDC {
    /*使用注解去掉 set方法*/
    @Autowired(required = false)
    private Cat cat;

    @Autowired(required = false)
    private Dog dog;

    private String str;
    public Cat getCat() {
        return cat;
    }
//
    public Dog getDog() {
        return dog;
    }
//
    public String getStr() {
        return str;
    }

//
//
//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }
//
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }
//
//    public void setStr(String str) {
//        this.str = str;
//    }
}
