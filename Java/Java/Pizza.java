package Java;

public class Pizza extends Food implements BakedFood,CookedFood {

    String name;
  //List<Java.Topping> toppings = new ArrayList<Java.Topping>();
    Base base;

    @Override
    public String toString() {
        return "Java.Pizza{" +
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
