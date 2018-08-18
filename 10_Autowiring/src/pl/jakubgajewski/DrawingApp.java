package pl.jakubgajewski;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        //Triangle triangle = new Triangle();

        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/spring.xml")); depracated!
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Triangle trójkącik = (Triangle) context.getBean("Wojciech");
        trójkącik.draw();
        System.out.println(trójkącik.toString());

        trójkącik.setType(TriangleType.RIGHT);

        Triangle triangle = (Triangle) context.getBean("Wojtek");
        triangle.draw();
        System.out.println(triangle.toString());


    }
}
