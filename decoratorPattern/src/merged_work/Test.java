package merged_work;

import static org.junit.Assert.assertEquals;

public class Test {
    // Completare l' assegnamento di p1 ,p2 ,p3 ,p4 opportunamente
    @org.junit.Test
    public void test(){
        Pizza JPpizza = new BasicPizza("Jacopo");

        assertEquals("Jacopo", JPpizza.getOwner());
        assertEquals("", JPpizza.getIngredients());
        assertEquals(200, JPpizza.getCost());

    
    }
}