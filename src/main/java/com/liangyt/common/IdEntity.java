package com.liangyt.common;

import java.io.Serializable;

/**
 * 描述：实体基础类
 *
 * @author liangyt
 * @创建时间 2017-06-30 15:31
 */
public class IdEntity implements Serializable {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
