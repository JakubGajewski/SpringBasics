package pl.jakubgajewski;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Shape shape1 = (Shape) context.getBean("triangle1");
        System.out.println(shape1 .toString());


    }
}
