package com.rackyun.multjob.main;

/**
 * @author yunhai.hu
 * @date 2018/9/30
 */
public class User {

    private String name;
    private int sex;
    private String blog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", blog='" + blog + '\'' +
                '}';
    }
}
