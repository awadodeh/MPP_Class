package part2;

import static java.lang.Math.PI;

/**
 * Created by 985191 on 5/27/2016.
 */
final public class Circle implements Shape{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double computeArea() {
        return PI * radius;
    }
}
