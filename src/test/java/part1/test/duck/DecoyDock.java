package part1.test.duck;

import part1.test.operations.Flying.CannotFly;
import part1.test.operations.quacking.MuteQuack;

/**
 * Created by 985191 on 5/27/2016.
 */
public class DecoyDock extends Duck{

    public DecoyDock() {

        super.flyBehavior=new CannotFly();
        super.quackBehavior=new MuteQuack();

    }

    public void display(){
        System.out.println("Decoy Duck Display");
    }
}
