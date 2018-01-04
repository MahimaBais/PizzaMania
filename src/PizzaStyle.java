import java.util.ArrayList;
import java.util.List;

public class PizzaStyle {

    String pizzaName;
    String crustType;
    String crustSize;
    List<String> toppings = new ArrayList<String>();

    @Override
    public String toString() {
        return "Pizza {" +
                "pizzaName='" + pizzaName + '\'' +
                ", crustType='" + crustType + '\'' +
                ", crustSize='" + crustSize + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
