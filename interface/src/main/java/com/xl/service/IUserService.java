package com.xl.service;

/**
 * Created by chanshuyi on 2016/1/19.
 */
public interface IUserService {

    /**
     * 登录方法
     * @return 是否登录成功
     */
    public boolean login(String username, String password);
}
