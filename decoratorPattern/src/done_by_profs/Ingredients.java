package done_by_profs;

public abstract class Ingredients implements Pizza{

    protected final Pizza basic;

    protected Ingredients(Pizza basic){
        this.basic = basic;
    }

    @Override
    public int getCost() {
        return this.basic.getCost();
    }

    @Override
    public String getIngredients() {
        return this.basic.getIngredients();
    }
    
}
