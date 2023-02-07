package basic_work;

import java.util.HashSet;
import java.util.Set;

public class BasicPizza implements Pizza{

    private final static double BASIC_COST = 3.00;
    private final String ownerName;
    private final Set<Ingredients> ingrs = new HashSet<>();
    

    public BasicPizza(String owner){
        ownerName = owner;
    }

    @Override
    public double getCost() {
        return BASIC_COST;
    }

    @Override
    public String getIngredients() {
        return ingrs.toString();
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }
    
}
