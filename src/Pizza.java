import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food implements BakedFood,CookedFood {

    String name;
  //List<Topping> toppings = new ArrayList<Topping>();
    Base base;

    @Override
    public String toString() {
        return "Pizza{" +
                "name ='" + name + '\'' +
                ",crustType =" + base.type +
                ", toppings =" + base.toppings +
                ",crustSize =" + base.size +
                ",flour =" + base.dough.flour +
                ",oil =" + base.dough.oil +
                ",water =" + base.dough.water +
                '}';
    }
}
