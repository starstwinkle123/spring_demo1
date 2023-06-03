package com.liwenjie.service.Impl;

import com.liwenjie.Dos.UserDao;
import com.liwenjie.Dos.Impl.UserDaoImpl;
import com.liwenjie.service.UserService;

public class UserServiceImpl implements UserService {
//    private UserDao userDao=new UserDaoImpl();
private UserDao userDao;
public void setUserDao(UserDao userDao){
    this.userDao=userDao;
}
    @Override
    public void getUser(){
        userDao.getUser();
    }

}
