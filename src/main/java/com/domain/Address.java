package com.domain;

public class Address {

    private String stree;
    private String state;

    public String getStree() {
        return stree;
    }

    public void setStree(String stree) {
        this.stree = stree;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(String stree, String state) {
        this.stree = stree;
        this.state = state;
    }
}
