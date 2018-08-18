package pl.jakubgajewski;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Triangle triangle1 = (Triangle) context.getBean("triangle1");
        System.out.println(triangle1.getApplicationContext());
        System.out.println(triangle1.getType());
        System.out.println(triangle1.toString());


    }
}
