package com.liangyt.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：登录
 *
 * @author tony
 * @创建时间 2017-06-22 22:25
 */
@SuppressWarnings("all")
@Controller
@RequestMapping(value = "/login")
public class Login {

    @RequestMapping()
    public String login() {
        return "login";
    }
}
