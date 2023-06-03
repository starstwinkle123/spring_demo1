package com.liwenjie.Dos.Impl;

import com.liwenjie.Dos.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser(){
        System.out.println("Oracle获取用户数据");
    }
}
