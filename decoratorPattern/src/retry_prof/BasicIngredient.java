package retry_prof;

public class BasicIngredient extends IngredientDecorator {

    private final String myIngredient;
    private final int myCost;


    protected BasicIngredient(Pizza decorated, String ingredient, int cost) {
        super(decorated);
        myIngredient = ingredient;
        myCost = cost;
    }


    @Override
    public int getCost() {
        return super.getCost() + myCost;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + myIngredient;
    }
    
}
