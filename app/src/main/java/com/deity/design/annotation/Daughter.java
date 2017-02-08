package com.deity.design.annotation;

/**
 * 女儿
 * Created by Deity on 2017/2/8.
 */
public class Daughter {
    /**起个响亮的名字*/
    private String userName;
    /**生日*/
    private String birthday;
    /**年龄*/
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    @HumanAnnotation(userName = "小宝宝",getMyBrithday = "2016年2月8日22:11:50",getMyAge = 2)
    public String toString() {
        String result = "这是我女儿>>>姓名:"+userName+" 年龄:"+age+" 出生日期:"+birthday;
        return result;
    }
}
