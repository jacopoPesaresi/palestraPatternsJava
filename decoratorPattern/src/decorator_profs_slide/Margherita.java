package decorator_profs_slide;

/*
 * This is the basic Pizza of all
 */


public class Margherita implements Pizza {
	
	public int getCost(){
		return 650;
	}
	
	public String getIngredients(){
		return "Pomodoro, Mozzarella";
	}
	
}
