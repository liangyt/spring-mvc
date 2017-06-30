package com.liangyt.entity;

/**
 * 描述：实体类
 *
 * @author liangyt
 * @创建时间 2017-06-21 14:56
 */
public class ReturnFather {
    private long id;
    private String name;
    private ReturnChild returnChild;

    public ReturnFather(long id, String name, ReturnChild returnChild) {
        this.id = id;
        this.name = name;
        this.returnChild = returnChild;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReturnChild getReturnChild() {
        return returnChild;
    }

    public void setReturnChild(ReturnChild returnChild) {
        this.returnChild = returnChild;
    }
}
