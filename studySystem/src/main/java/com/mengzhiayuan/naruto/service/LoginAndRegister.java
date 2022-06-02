package com.mengzhiayuan.naruto.service;

/**
 * @Auther: 梦致A远
 * @Date: 2022/6/1 11:16
 * @Description:
 */

public interface LoginAndRegister {

    int login(String username,String password);
    int register(String username,String password,int status);

}

