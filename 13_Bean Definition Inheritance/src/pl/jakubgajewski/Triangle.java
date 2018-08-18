package pl.jakubgajewski;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware {

    private String name;

    private TriangleType type;

    private List<Point> points;

    private ApplicationContext context;


    public TriangleType getType() {
        return type;
    }

    public void setType(TriangleType type) {
        this.type = type;
    }

    public void draw () {
        System.out.println("   x   ");
        System.out.println("  x x   ");
        System.out.println(" x   x   ");
        System.out.println("xxxxxxxx ");
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }


    @Override
    public String toString() {
        StringBuilder triangleStringBuilder = new StringBuilder();
        triangleStringBuilder.append("\n ------------------------------ \n:Triangle name: " + this.name)
                .append("\n:Context: " + this.context)
                .append("\n:Points: ");
        points.forEach(p -> triangleStringBuilder.append(p.toString()));
        return triangleStringBuilder.toString();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public ApplicationContext getApplicationContext () {
        return this.context;
    }

    @Override
    public void setBeanName(String beanName) {
        this.name = beanName;
        System.out.println(beanName + " is the bean name");
    }
}
