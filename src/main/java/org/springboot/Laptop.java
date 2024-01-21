package org.springboot;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop Object Created");
    }

    @Override
    public void start(){
        System.out.println("Starting Laptop :)");
    }


}
