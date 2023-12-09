package org.example;

import com.sun.security.jgss.GSSUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Knight knight=new Knight();
//        knight.setQuest(new SingYoYeYoQuest());
//        System.out.println(knight.goQuest());
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        Knight knight=context.getBean(Knight.class);
        System.out.println(knight.goQuest());



    }
}









