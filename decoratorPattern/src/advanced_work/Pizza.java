package advanced_work;
import java.util.Set;

public interface Pizza {

    double getCost();

    int getSize();

    Set<Ingredients> getIngredients();

    String getPasteType();

}
