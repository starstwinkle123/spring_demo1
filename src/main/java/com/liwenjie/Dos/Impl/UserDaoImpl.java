package com.liwenjie.Dos.Impl;

import com.liwenjie.Dos.UserDao;

//继承
public class UserDaoImpl implements UserDao {
    @Override//重写
    public void getUser() {
        System.out.println("平常获取用户数据");
    }

}
