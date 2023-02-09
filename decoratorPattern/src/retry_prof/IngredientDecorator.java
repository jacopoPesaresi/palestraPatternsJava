package retry_prof;

public abstract class IngredientDecorator implements Pizza{

    protected final Pizza decorated;
	
	protected IngredientDecorator(Pizza decorated){
		this.decorated = decorated;
	}
	
	public int getCost(){
		return this.decorated.getCost();
	}
	
	public String getIngredients(){
		return this.decorated.getIngredients();
	}
    
}
