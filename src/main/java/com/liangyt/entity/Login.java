package com.liangyt.entity;

import com.liangyt.common.IdEntity;

/**
 * 描述：
 *
 * @author tony
 * @创建时间 2017-06-30 15:30
 */
public class Login extends IdEntity {
    private String name;
    private String password;
    private String rememberMe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(String rememberMe) {
        this.rememberMe = rememberMe;
    }
}
