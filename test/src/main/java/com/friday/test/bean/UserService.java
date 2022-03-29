package com.friday.test.bean;

public class UserService  {

    private String userId;

    private String company;

    private String location;

    private IUserDao userDao;

    public String queryUserInfo(){
        return userDao.queryUserName(userId) + "," + company + "," + location;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    @Override
//    public String toString() {
//        return "UserService{" +
//                "userId='" + userId + '\'' +
//                ", company='" + company + '\'' +
//                ", location='" + location + '\'' +
//                ", userDao=" + userDao +
//                '}';
//    }
}
