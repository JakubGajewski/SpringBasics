package pl.jakubgajewski;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

    private TriangleType type;

    private Point pointA;
    private Point pointB;
    private Point pointC;
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

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "type=" + type +
                ", pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", context=" + context +
                '}';
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
        System.out.println(beanName + " is the bean name");
    }
}
