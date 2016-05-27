package part1.test.duck;

import part1.test.operations.Flying.FlyWithWings;
import part1.test.operations.quacking.Quack;

/**
 * Created by 985191 on 5/27/2016.
 */
public class RedheadDuck extends Duck{

    public RedheadDuck() {

        super.flyBehavior=new FlyWithWings();
        super.quackBehavior=new Quack();
    }

    public void display() {
        System.out.println("ReadheadDuck IS HERE");
    }
}
