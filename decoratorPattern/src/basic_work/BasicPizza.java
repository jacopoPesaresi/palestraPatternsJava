package basic_work;

import java.util.HashSet;
import java.util.Set;

public class BasicPizza implements Pizza{

    private final static double BASIC_COST = 3.00;
    private final String ownerName;
    

    public BasicPizza(String owner){
        ownerName = owner;
    }

    @Override
    public double getCost() {
        return BASIC_COST;
    }

    @Override
    public String getIngredients() {
        return "";
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }
    
}
