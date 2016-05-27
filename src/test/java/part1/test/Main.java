package part1.test;

import part1.test.duck.*;

/**
 * Created by 985191 on 5/27/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        Duck[] ducks=
                {new MallardDuck(),new DecoyDock(), new RedheadDuck(), new RubberDuck()};

        for (Duck d: ducks)
        {
            System.out.println(d.getClass().getSimpleName()+":");
            d.display();
            d.fly();
            d.quack();
            d.swim();

        }
    }
}
