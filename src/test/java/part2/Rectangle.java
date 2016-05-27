package part2;

/**
 * Created by 985191 on 5/27/2016.
 */
final public class Rectangle implements Shape{

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea() {
        return width * height;
    }
}
