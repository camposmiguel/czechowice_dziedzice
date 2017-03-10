package com.miguelcr.a02_customlistview;

/**
 * Created by miguelcampos on 9/3/17.
 */

public class Student {
    private String name;
    private int age;
    private String sex;
    private String photo;

    public Student(String name, int age, String sex, String photo) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
