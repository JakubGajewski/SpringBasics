package pl.jakubgajewski;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();

        Triangle triangle1 = (Triangle) context.getBean("triangle1");
        System.out.println(triangle1.toString());


    }
}
