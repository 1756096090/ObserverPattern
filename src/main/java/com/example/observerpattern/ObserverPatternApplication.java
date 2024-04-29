package com.example.observerpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverPatternApplication {


    public static void main(String[] args) {
        Channel modelado = new Channel();
        Subscriber s1 = new Subscriber("Isaac");
        Subscriber s2 = new Subscriber("Diego");
        Subscriber s3 = new Subscriber("Mateo");
        Subscriber s4 = new Subscriber("Oscar");
        Subscriber s5 = new Subscriber("Juan");

        modelado.subcribe(s1);
        modelado.subcribe(s2);
        modelado.subcribe(s3);
        modelado.subcribe(s4);
        modelado.subcribe(s5);

        s1.subscribeChannel(modelado);
        s2.subscribeChannel(modelado);
        s3.subscribeChannel(modelado);
        s4.subscribeChannel(modelado);
        s5.subscribeChannel(modelado);

        modelado.upload("Ne movile");

    }


}
