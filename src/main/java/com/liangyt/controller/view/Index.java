package com.liangyt.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：Controll
 *
 * @author tony
 * @创建时间 2017-06-21 16:04
 */
@SuppressWarnings("all")
@Controller
public class Index {

    @RequestMapping(value = "/")
    public String index() {
        return "login";
    }
}
