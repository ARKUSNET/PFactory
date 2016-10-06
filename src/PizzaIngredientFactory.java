import ingredient.*;

/**
 * Created by a.kuspakov on 05.10.2016.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSause();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
