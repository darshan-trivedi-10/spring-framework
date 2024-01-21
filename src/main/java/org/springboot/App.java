package org.springboot;
import org.springboot.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Spring Bean XML Config
public class App
{
    public static void main( String[] args )
    {
        // Java Based Config

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean(Desktop.class);
        dt.start();

        Alien obj = context.getBean(Alien.class);
        obj.code();
        obj.getLaptop().start();


//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.start();



        // XML Based Spring Configration
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        System.out.println("Program Execution Started :)");
//        Alien obj = context.getBean("alien", Alien.class);
//        obj.code();
//        obj.getLaptop().start();
    }
}