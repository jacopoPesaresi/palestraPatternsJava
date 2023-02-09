package retry_prof;

public class ResetIngredient extends BasicIngredient {

    protected ResetIngredient(Pizza decorated) {
        super(new BasicPizza(), "", 0);
    }
    
}
