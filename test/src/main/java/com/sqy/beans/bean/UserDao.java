package com.sqy.beans.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String,String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001","sqy");
        hashMap.put("10002","sjj");
        hashMap.put("10003","xhx");
    }

    public String queryUserName(String userId) {
        return hashMap.get(userId);
    }
}
