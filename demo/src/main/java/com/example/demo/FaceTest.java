package com.example.demo;

import java.io.Serializable;

public  class FaceTest implements Cloneable , Serializable {
    private static final long serialVersionUID = 3351938703735502506L;

    public String doSomething() {
        return null;
    }

    private String name;
    private String age;

    public FaceTest() {
    }

    public FaceTest(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "FaceTest{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    protected FaceTest clone() throws CloneNotSupportedException {
        return (FaceTest) super.clone();
    }
}
