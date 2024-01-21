package org.springboot.config;


import org.springboot.Alien;
import org.springboot.Computer;
import org.springboot.Desktop;
import org.springboot.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.springboot")
public class AppConfig {
//
//
////    @Bean(name = {"Desktop", "Desk", "Computer"})
////    @Scope("prototype")
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Alien alien( Laptop laptop){ // @Qualifier("laptop") - it's like ref
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setLaptop(laptop);
//        return obj;
//    }
//
////    @Primary
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }
//



}
