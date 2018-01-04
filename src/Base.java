import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Base extends Food implements Bakeable,Cookable{

    Dough dough;
    String type;
    String size;
    List<Topping> toppings = new ArrayList<Topping>();
    int heatTemperature;
    int timings;

    void applySauce(Sauce s) {

        out.println(s.name + " is Applied on base");

    }

    BaseWithTopping applyTopping(Topping t) {

       // System.out.println(t+ " is applied on base");
//      BaseWithTopping bwt = new BaseWithTopping(this,toppings);
        BaseWithTopping bwt = new BaseWithTopping(this);
        bwt.applyTopping(t);

        return bwt;
    }

    @Override
    public BakedFood bake() {

        Pizza pizza = new Pizza();

        return pizza;
    }

    BaseWithCheese applyCheese(Cheese c){

        out.println("To make cheese burst crust apply "+ c+" on base.");
        BaseWithCheese baseWithCheese = new BaseWithCheese();

        return baseWithCheese;
    }

    @Override
    public CookedFood bakeOnPan() {

        Pizza pizza = new Pizza();

        return pizza;
    }
}
