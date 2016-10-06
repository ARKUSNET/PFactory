import ingredient.*;

/**
 * Created by a.kuspakov on 05.10.2016.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal alices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    String setName(String name){
        return name;
    }

    public String toString(){
        //TODO
        return "";
    }
}
