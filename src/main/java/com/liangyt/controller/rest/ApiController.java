package com.liangyt.controller.rest;

import com.liangyt.common.message.MessageReturn;
import com.liangyt.entity.Login;
import com.liangyt.entity.ReturnChild;
import com.liangyt.entity.ReturnFather;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述：RestController
 *
 * @author liangyt
 * @创建时间 2017-06-21 14:41
 */
@SuppressWarnings("all")
@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @RequestMapping(value = "/returnMap")
    public Object returnMap() {
        Map map = new HashMap();
        map.put("test", "我是测试返回Map");
        return map;
    }

    @RequestMapping(value = "/returnObject")
    public Object returnEntity() {
        ReturnChild returnChild = new ReturnChild(100L, "I am Child", new Date());
        ReturnFather returnFather = new ReturnFather(200L, "I am father", returnChild);
        return  returnFather;
    }

    @RequestMapping(value = "/login")
    public Object login(Login login) {
        System.out.println(login.getName());
        return MessageReturn.success();
    }
}
