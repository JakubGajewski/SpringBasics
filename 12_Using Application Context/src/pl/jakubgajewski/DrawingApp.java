package pl.jakubgajewski;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//      ApplicationContext context2 = new ClassPathXmlApplicationContext("spring2.xml");
//
//        Triangle equiTrojkat = (Triangle) context.getBean("triangle");
//        equiTrojkat.setType(TriangleType.EQUILATERAL);
//        equiTrojkat.setApplicationContext(context);
//        System.out.println(equiTrojkat.getApplicationContext());
//        equiTrojkat = (Triangle) context.getBean("triangle");

//        Triangle rightTrojkat = (Triangle) context2.getBean("triangle");
//        rightTrojkat.setType(TriangleType.RIGHT);
//        rightTrojkat.setApplicationContext(context2);
//        rightTrojkat.setBeanName("Alfons");
//
//        System.out.println(equiTrojkat.toString());
//        System.out.println(rightTrojkat.toString());
//
//        System.out.println(equiTrojkat.getApplicationContext());
    }
}
