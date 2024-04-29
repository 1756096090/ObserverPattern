package com.example.observerpattern;


import org.springframework.boot.SpringApplication;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hey"+name+"Video uploaded");
    }
    public void subscribeChannel(Channel ch){
        channel = ch;
    }

}
