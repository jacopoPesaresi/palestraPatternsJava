package done_by_profs;

public class BasicPizza implements Pizza {

    @Override
    public int getCost() {
        return 500;
    }

    @Override
    public String getIngredients() {
        return "Pomodoro";
    }
    
}
