package part1.test.duck;

import part1.test.operations.Flying.FlyBehavior;
import part1.test.operations.quacking.QuackBehavior;

/**
 * Created by 985191 on 5/27/2016.
 */
public abstract class Duck{

    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public void swim()
    {
        System.out.println("Standerd Swimming");
    }
    public void fly()
    {
        flyBehavior.fly();
    }

    public void quack()
    {
        quackBehavior.quack();
    }

    public abstract void display();
}
