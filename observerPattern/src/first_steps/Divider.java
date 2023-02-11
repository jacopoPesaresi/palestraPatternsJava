package first_steps;

public class Divider implements Observer {

    private final int myConst;

    public Divider(int val){
        myConst = val;
    }

    @Override
    public void valueInsered(int val) {
        System.out.println(myConst/val);
    }
    
}
