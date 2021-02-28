package kz.iitu.spring.demo_atm;
import org.springframework.context.support.AbstractApplicationContext;
import models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoAtmApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAtmApplication.class, args);

        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
      context.scan("models");
      context.refresh();
        ATM atm = context.getBean("atm", ATM.class);
        atm.run();


    }

}
