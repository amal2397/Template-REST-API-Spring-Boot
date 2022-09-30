package com.cajang.myserver.Greeting;

public class Greeting {
    private int id;
    private String content;

    public Greeting(int i, String content) {
        this.id = i;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
