package merged_work;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class Ingredients implements Pizza {

    private final List<Ingredients> ingre = new LinkedList<>();
    private final Pizza started;

    public Ingredients(Pizza start){
        started = start;
    }

    @Override
    public int getCost() {
        return started.getCost() + ingre.stream().mapToInt(i -> i.getCost()).sum();
    }

    @Override
    public String getIngredients() {
        //String tmp = started.;
        return ingre.stream().map(i -> i.toString()).collect(Collectors.joining(",","[","]"));
    }

    @Override
    public String getOwner() {
        return started.getOwner();
    }

    
    
}
