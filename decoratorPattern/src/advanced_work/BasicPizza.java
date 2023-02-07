package advanced_work;
import java.util.HashSet;
import java.util.Set;

public class BasicPizza implements Pizza{

    private final static int BASIC_SIZE = 30;
    private final static double BASIC_COST = 5.00;
    private final Set<Ingredients> ingredients;
    private PasteType pasteType;
    private final String ownerName;

    public BasicPizza(String ownerName){
        ingredients = new HashSet<>();
        this.ownerName = ownerName;
        pasteType = PasteType.NORMAL;
    }


    @Override
    public double getCost() {
       return BASIC_COST;
    }

    @Override
    public int getSize() {
        return BASIC_SIZE;
    }

    @Override
    public String getPasteType() {
        return pasteType.toString();
    }

    private String getCharacteristics(){
        return "Pizza whit: ";
    }

    @Override
    public String toString(){
        return "Owner name: " + ownerName + "\n" + getCharacteristics();
    }


    @Override
    public Set<Ingredients> getIngredients() {
        return ingredients;
    }
    
}
