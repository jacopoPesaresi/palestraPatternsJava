package retry_prof;

public class BasicPizza implements Pizza{

    private static final int BASIC_COST = 300;
    private static final String BASIC_INGREDIENTS = "";

    @Override
    public int getCost() {
        return BASIC_COST;
    }

    @Override
    public String getIngredients() {
        return BASIC_INGREDIENTS;
    }
    
}
