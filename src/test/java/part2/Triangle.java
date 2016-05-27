package part2;

/**
 * Created by 985191 on 5/27/2016.
 */
final public class Triangle implements Shape{
    private final double base;
    private final double height;

    public Triangle(double base, double height)
    {
        this.height=height;
        this.base=base;

    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea() {
        double n= 0.5 * base * height;
        return n;
    }
}
