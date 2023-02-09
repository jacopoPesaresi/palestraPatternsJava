package retry_prof;

public class Main {

    public static void main(String args[]){
        Pizza p1 = new BasicPizza();
        System.out.println(p1.getCost() + " / " + p1.getIngredients());

        Pizza p2 = new Sausage(new BasicPizza());
        System.out.println(p2.getCost() + " / " + p2.getIngredients());

        Pizza p3 = new GlutenFree(new Sausage(new BasicPizza()));
        System.out.println(p3.getCost() + " / " + p3.getIngredients());

        Pizza p4 = new Sausage(p3);
        System.out.println(p4.getCost() + " / " + p4.getIngredients());

        Pizza p5 = new ResetIngredient(p4);
        System.out.println(p5.getCost() + " / " + p5.getIngredients());
    }
}
