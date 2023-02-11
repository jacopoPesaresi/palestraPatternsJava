package first_steps;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Test{

    @org.junit.Test
    public void test(){
        Random r = new Random();
        List<Integer> myConst = Stream.generate(() -> r.nextInt(0,10)).limit(10).toList();
        List<Observer> myObservers = myConst.stream().map(i -> i%2==0 ? new Divider(i) : new Multiply(i)).toList();
        System.out.println(myConst);
        myObservers.stream().forEach(o -> o.valueInsered(2));
        System.out.println("Ciao mondo");

    }
}