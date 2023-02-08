package basic_work;

public class Sausage extends Ingredients{

    private final static double cost = 1.5;

    public Sausage(Pizza p){
        super(p);
    }

    @Override
    public String toString(){
        return "Salciccia";
    }
    
}