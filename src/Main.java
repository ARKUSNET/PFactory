/**
 * Created by a.kuspakov on 05.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = new ClamPizza(ingredientFactory);
        pizza.name = "New York";
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
