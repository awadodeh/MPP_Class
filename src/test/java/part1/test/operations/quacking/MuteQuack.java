package part1.test.operations.quacking;

/**
 * Created by 985191 on 5/27/2016.
 */
public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("Can Not Quack");
    }
}
