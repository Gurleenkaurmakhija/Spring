package com.greeting;

public class Greeting {

    private int id;
    private String message;

    //constructor
    public Greeting() {}

    public Greeting(int id, String message) {
        this.id = id;
        this.message = message;
    }

    //getter and setter
    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

