package merged_work;

public class BasicPizza implements Pizza{

    private static final int BASIC_COST = 200;
    private final String owner;

    public BasicPizza(String owner){
        this.owner = owner;
    }

    @Override
    public int getCost() {
        return BASIC_COST;
    }

    @Override
    public String getIngredients() {
        return "";
    }

    @Override
    public String getOwner() {
        return owner;
    }
    
}
