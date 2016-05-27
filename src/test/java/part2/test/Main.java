package part2.test;

import part1.test.duck.*;
import part2.Circle;
import part2.Rectangle;
import part2.Shape;
import part2.Triangle;

/**
 * Created by 985191 on 5/27/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        Shape[] shapes=
                {new Circle(15),new Rectangle(5,12), new Triangle(5,7)};

        for (Shape d: shapes)
        {
            System.out.println(d.getClass().getSimpleName()+":");
            System.out.println(d.computeArea());
        }



    }
}
