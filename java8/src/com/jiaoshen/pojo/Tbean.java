package com.jiaoshen.pojo;

/**
 * @author jiaoshen
 * @date 2020/1/9-23:23
 */
public class Tbean {
    String id;
    Integer allNum;
    Integer num;

    public Tbean(String id, Integer allNum, Integer num) {
        this.id = id;
        this.allNum = allNum;
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
