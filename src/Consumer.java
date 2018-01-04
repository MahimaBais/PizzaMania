import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Consumer extends Person {

    String name;

    Pizza placeOrder(Chef c) {

        PizzaStyle pizzaStyle = new PizzaStyle();

        pizzaStyle.pizzaName = selectPizzaName();

        pizzaStyle.crustType = selectCrustType();

        pizzaStyle.crustSize = selectCrustSize();

        pizzaStyle.toppings = selectTopping();

        System.out.println(name + " ordered " + pizzaStyle);

        return c.preparePizza(pizzaStyle);

    }

    void eat(Pizza p) {

        System.out.println(name + " is eating " + p);

    }

    public static String selectPizzaName() {

        int selection;
        String pizzaName = null;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Which pizza number do you like to have? ");
        System.out.println("******************************************\n");
        System.out.println("1 - Deluxe Veggie");
        System.out.println("2 - Veg Extravaganza");
        System.out.println("3 - 5 Pepper");
        System.out.println("4 - Double Cheese Margherita");
        System.out.println("5 - Cheese N Corn");
        System.out.println("6 - Fresh Veggies");
        System.out.println("7 - Panner Makhani");

        selection = input.nextInt();

        switch (selection){
            case 1:
                pizzaName = "Deluxe Veggie";
                break;
            case 2:
                pizzaName = "Veg Extravaganza";
                break;
            case 3:
                pizzaName = "5 Pepper";
                break;
            case 4:
                pizzaName = "Double Cheese Margherita";
                break;
            case 5:
                pizzaName = "Cheese N Corn";
                break;
            case 6:
                pizzaName = "Fresh Veggies";
                break;
            case 7:
                pizzaName = "Panner Makhani";
                break;
            default:
                System.out.println("Sorry you have selected wrong number.");
                pizzaName = "-1";
                break;
        }

        return pizzaName;
    }


    public static String selectCrustType() {

        int selection;
        String crustType = null;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose crust number from these choices");
        System.out.println("****************************************\n");
        System.out.println("1 - Cheese Burst ");
        System.out.println("2 - Wheat Thin Crust");
        System.out.println("3 - Fresh Pan Pizza");

        selection = input.nextInt();

        switch (selection){
            case 1:
                crustType = "Cheese Burst";
                break;
            case 2:
                crustType = "Wheat Thin Crust";
                break;
            case 3:
                crustType = "Fresh Pan Pizza";
                break;
            default:
                System.out.println("Sorry you have selected wrong number.");
                crustType = "-1";
                break;
        }


        return crustType;
    }


    public static String selectCrustSize() {

        int selection;
        String crustSize = null;
        Scanner input = new Scanner(System.in);


        System.out.println("Choose crust size number");
        System.out.println("**************************\n");
        System.out.println("1 - Small ");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");

        selection = input.nextInt();

        switch (selection){
            case 1:
                crustSize="Small";
                break;
            case 2:
                crustSize = "Medium";
                break;
            case 3:
                crustSize = "Large";
                break;
            default:
                crustSize = "-1";
                break;
        }

        return crustSize;
    }

    public static List<String> selectTopping() {

        String topping = null;
        List<String> toppingList = new ArrayList<String>();
        int selection = 0;
        String result = null;
        Scanner input = new Scanner(System.in);

        System.out.println("Which toppings do you want?");
        System.out.println("*****************************\n");
        System.out.println("1 - Cheese ");
        System.out.println("2 - Tomato");
        System.out.println("3 - Corn");
        System.out.println("4 - Jalapeno");
        System.out.println("5 - Onion");
        System.out.println("6 - Olive");

        do {
            selection = input.nextInt();

            switch (selection){
                case 1:
                    topping = "Cheese";
                    break;
                case 2:
                    topping = "Tomato";
                    break;
                case 3:
                    topping = "Corn";
                    break;
                case 4:
                    topping = "Jalapeno";
                    break;
                case 5:
                    topping = "Onion";
                    break;
                case 6:
                    topping = "Olive";
                    break;
                default:
                    topping = "-1";
                    break;
            }

            if(toppingList.contains(topping)){
                System.out.println("This topping is already in list");
            }else {
                if (selection != 0 || selection != -1) {
                    toppingList.add(topping);
                    System.out.println("Would you like to continue?(y/n)");
                    result = input.next();
                }
            }

        } while (result.equals("y"));

        return toppingList;

    }


}
