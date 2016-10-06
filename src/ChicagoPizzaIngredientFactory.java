import additive.BlackOlives;
import additive.EggPlant;
import additive.Spinach;
import ingredient.*;
import region.chicago.FrozenClams;
import region.chicago.Mozzarella;
import region.chicago.PlumTomatoSauce;
import region.chicago.ThickCrustDough;
import region.newyork.SlicedPepperoni;

/**
 * Created by a.kuspakov on 05.10.2016.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSause() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
