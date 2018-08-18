package pl.jakubgajewski;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class Triangle implements InitializingBean, DisposableBean {

    private String name;

    private TriangleType type;

    private List<Point> points;

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
                .append("\n:Points: ");
        points.forEach(p -> triangleStringBuilder.append(p.toString()));
        return triangleStringBuilder.toString();
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean init method called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposibleBean destroy method called");
    }
}
