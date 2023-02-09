package retry_prof;

public class GlutenFree extends BasicIngredient {

    protected GlutenFree(Pizza decorated) {
        super(decorated, "", 0);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int getCost() {
        return (int) (super.getCost() * 1.1);
    }

    @Override
    public String getIngredients() {
        return "[GF]" + super.getIngredients();
    }

    
    
}
