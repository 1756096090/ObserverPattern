package com.example.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subs =  new ArrayList<>();
    private  String title;
    public void subcribe(Subscriber sub){
        subs.add(sub);
    }

    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }
    public void notifySubcribers(){
     for(Subscriber sub: subs){
         sub.update();
     }
    }

    public  void upload(String title){
        this.title = title;
        notifySubcribers();
    }
}
