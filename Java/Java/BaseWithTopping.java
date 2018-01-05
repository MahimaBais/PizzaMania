package Java;

import java.util.ArrayList;
import java.util.List;

public class BaseWithTopping extends Base implements Bakeable,Cookable {

    Base base;
    List<Topping> toppings = new ArrayList<>();

    public BaseWithTopping(Base base) {
        this.base = base;
    }

    @Override
    BaseWithTopping applyTopping(Topping t) {

        this.toppings.add(t);
        System.out.println(t+" is applied on base");
        return this;

    }

    @Override
    public BakedFood bake() {

        Pizza pizza = new Pizza();
        pizza.base = this.base;
        pizza.base.toppings = this.toppings;

        return pizza;
    }


    @Override
    public String toString() {
        return "Java.BaseWithTopping{" +
                "toppings=" + toppings +
                '}';
    }

    @Override
    public CookedFood bakeOnPan() {

        Pizza pizza = new Pizza();
        pizza.base = this.base;
        pizza.base.toppings = this.toppings;

        return pizza;

    }
}
