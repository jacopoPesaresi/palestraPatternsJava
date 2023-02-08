package done_by_profs;

public class Sausage extends Ingredients{

    protected Sausage(Pizza basic) {
        super(basic);
    }

    @Override
    public int getCost() {
        return this.basic.getCost() + 150;
    }

    @Override
    public String getIngredients() {
        return this.basic.getIngredients()+ " Salsiccia";
    }
    
}
