package first_steps;

public class Multiply implements Observer {

    private final int constant;

    public Multiply(int constant){
        this.constant = constant;
    }

    @Override
    public void valueInsered(int val) {
        System.out.println(val * constant);
    }


    
}
