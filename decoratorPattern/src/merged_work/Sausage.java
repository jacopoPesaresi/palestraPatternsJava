package merged_work;

public class Sausage extends Ingredients{

    public Sausage(Pizza start) {
        super(start);
        //TODO Auto-generated constructor stub
    }

    public Sausage(String ownerName){
        Pizza p = new BasicPizza(ownerName);
        super(p);
    }
    
}
