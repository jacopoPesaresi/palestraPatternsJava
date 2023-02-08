package basic_work;

import java.util.HashSet;
import java.util.Set;

public abstract class Ingredients implements Pizza {

    protected Pizza basic;
    private final Set<Ingredients> ingrs = new HashSet<>();
    //private final Set<Ingredients> actualIngrs;

    protected Ingredients(Pizza p){
        this.basic = p;
        //actualIngrs = p
    }

    @Override
    public double getCost() {
        return basic.getCost() + ingrs.stream().mapToDouble(i -> i.getCost()).sum();
    }

    @Override
    public String getIngredients() {
        return ingrs.toString();
    }

    @Override
    public String getOwnerName() {
        return basic.getOwnerName();
    }

    //protected 

}
