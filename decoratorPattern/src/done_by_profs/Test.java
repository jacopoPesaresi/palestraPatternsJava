package done_by_profs;

import static org.junit.Assert.assertEquals;

public class Test {
    // Completare l' assegnamento di p1 ,p2 ,p3 ,p4 opportunamente
    @org.junit.Test
    public void test(){
    Pizza p1 = new Sausage(new BasicPizza()) ; // funghi + salsiccia su base margherita
    //Pizza p2 = null ; // margherita
    Pizza p3 = new Sausage(p1) ; // doppia salsiccia su base margherita
    //Pizza p4 = null ; // come p3 ma stesa
    // stampe di comodo
    System.out.println(p1.getCost()+" "+p1.getIngredients());
    System.out.println(p3.getCost()+" "+p3.getIngredients());
   // System.out.println(p2.getCost()+" "+p2.getIngredients());
   // System.out.println(p3.getCost()+" "+p3.getIngredients());
   // System.out.println(p4.getCost()+" "+p4.getIngredients());
    // test correttezza di costi e stringhe
    assertEquals(p1.getCost(), 650); // 6.50 + 1.00 + 1.50
    assertEquals(p3.getCost(), 800); // 6.50 + 1.00 + 1.50
   // assertEquals(p2.getCost(), 650);
   // assertEquals(p3.getCost(), 950); // 6.50 + 1.50 + 1.50
   // assertEquals(p4.getCost(), 1045) ;// (6.50 + 1.50 + 1.50) + 10%
    assertEquals(p1.getIngredients(), "Pomodoro Salsiccia");
    assertEquals(p3.getIngredients(), "Pomodoro Salsiccia Salsiccia");
   // assertEquals(p2.getIngredients(), "Pomodoro, Mozzarella ");
   // assertEquals(p3.getIngredients(), "Pomodoro, Mozzarella, Salsiccia, Salsiccia ");
   // assertEquals(p4.getIngredients(), "[GF] Pomodoro, Mozzarella, Salsiccia, Salsiccia ");
    
    }
}