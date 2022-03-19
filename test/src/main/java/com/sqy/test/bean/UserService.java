package com.sqy.test.bean;

public class UserService {

    private String userId;

    private UserDao userDao;

    public void queryUserInfo(){
        System.out.println("查询用户信息: " + userDao.queryUserName(userId));
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
