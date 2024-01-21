package org.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    private Computer laptop;

    @Value("21")
    private int age;

    public Alien(int _age, Computer _laptop){
        age = _age;
        laptop = _laptop;
    }

    public Computer getLaptop() {
        return laptop;
    }

    public void setLaptop(Computer laptop)  {
        this.laptop = laptop;
    }

    public Alien(){
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        laptop.start();
        System.out.println("Code Method");
    }
}
