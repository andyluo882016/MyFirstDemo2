package com.demo;

public class Show {

    private Integer a;
    private Integer b;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Show(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    public Integer add(Integer a, Integer b) {
        System.out.println("-->> "+ a+"  "+b);
        return a+b;
    }
}
