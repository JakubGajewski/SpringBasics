package pl.jakubgajewski;

public class Circle {

    private String name;

    private Point pointA;

    public void draw () {
        System.out.println("   x x   ");
        System.out.println(" x     x   ");
        System.out.println(" x     x   ");
        System.out.println("   x x   ");
    }

    @Override
    public String toString() {
        StringBuilder circleStringBuilder = new StringBuilder();
        circleStringBuilder.append("\n ------------------------------ \n:Triangle name: " + this.name)
                .append("\n:Points: " + this.pointA);
        return circleStringBuilder.toString();
    }

    public void initMethod() {
        System.out.println("Circle is here!");
    }

    public void endMethod() {
        System.out.println("Circle says bye bye!");
    }
}
