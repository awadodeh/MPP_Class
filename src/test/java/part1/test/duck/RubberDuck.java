package part1.test.duck;

import part1.test.operations.Flying.CannotFly;
import part1.test.operations.quacking.Squeak;

/**
 * Created by 985191 on 5/27/2016.
 */
public class RubberDuck extends Duck{


    public RubberDuck() {
        super.flyBehavior=new CannotFly();
        super.quackBehavior=new Squeak();
    }

    public void display() {
        System.out.println("Rubber part1.test.duck.Duck");

    }
}
