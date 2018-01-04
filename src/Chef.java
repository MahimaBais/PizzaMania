public class Chef extends Person {

    String name;
    Flour flour = new Flour();
    Water water = new Water();
    Oil oil = new Oil();

    Pizza preparePizza(PizzaStyle ps) {

        int temperature = 0;
        int timing = 0;
        Pizza pizza;


        water.type = "Warm";
        water.quantity = "2 cup";

        switch (ps.crustType) {

            case "Wheat Thin Crust":

                flour.name = "Wheat";
                flour.quantity = "1 bowl";
                oil.name ="Vegetable";
                oil.quantity = "2 tablespoon";

                break;

            case "Cheese Burst":

                flour.name = "All Purpose";
                flour.quantity = "1 bowl";
                oil.name ="Canola";
                oil.quantity = "2.5 tablespoon";

                break;

            case "Fresh Pan Pizza":

                flour.name = "All Purpose";
                flour.quantity = "1 bowl";
                oil.name = "Olive";
                oil.quantity = "3 tablespoon";

                break;

            default:

                break;
        }

        Dough dough = mix(flour, water, oil);
        dough.flour = flour;
        dough.oil = oil;
        dough.water = water;

        Base base = makeBase(dough);
        base.type = ps.crustType;
        base.size = ps.crustSize;

        switch (base.type){

            case "Wheat Thin Crust":

                WheatThinCrust wheatThinCrust = new WheatThinCrust();
                temperature = wheatThinCrust.heatTemperature;
                timing = wheatThinCrust.timings;
                break;

            case "Cheese Burst":
                Cheese cheese = new Cheese("Mozzarella");
                BaseWithCheese baseWithCheese = base.applyCheese(cheese);
                Base newbase = makeBase(dough);
                CheeseBurst cheeseBurst = baseWithCheese.applyNewBase(newbase);
                System.out.println("Cheese burst crust is ready to apply sauce and toppings");
                temperature = cheeseBurst.heatTemperature;
                timing = cheeseBurst.timings;
                break;

            case "Fresh Pan Pizza":

                FreshPanPizza freshPanPizza = new FreshPanPizza();
                temperature = freshPanPizza.heatTemperature;
                timing = freshPanPizza.timings;

                break;

            default:

                break;

        }

        Sauce sauce = new Sauce();
        sauce.name = "Pizza Sauce";


        base.applySauce(sauce);


        for (String topping : ps.toppings) {

            base = base.applyTopping(new Topping(topping));

        }


        if(ps.crustType == "Fresh Pan Pizza"){
            CookedFood cookedFood = bakeOnPan(base);
            pizza = (Pizza) cookedFood;

        }else {
            System.out.println(ps.crustType);
            BakedFood bakedFood = bake(base, temperature, timing);
            pizza = (Pizza) bakedFood;
        }

        pizza.name = ps.pizzaName;
        pizza.base.dough = dough;


        return pizza;

    }

    private BakedFood bake(Base base, int temperature, int time) {

        Oven o = new Oven();
        o.start();
        o.preHeat(180);
        o.open();
        o.put(base);
        o.setTemperature(temperature);
        o.setTiming(time);
        o.stop();

        return o.remove();
    }

    private CookedFood bakeOnPan(Base base) {

        Pan p = new Pan();
        p.startBurner();
        p.putPanOnBurner();
        p.preHeatPan();
        p.put(base);
        p.cover();

        return p.remove();
    }


    private Dough mix(Flour flour, Water water, Oil oil) {

        System.out.println("Chef mixed Ingredients : " + flour + "," + water + "," + oil);
        Dough dough = new Dough();
        System.out.println("Now dough is ready but to make base grease it well,cover it and wait for an hour");

        return dough;

    }

    private Base makeBase(Dough d) {

        System.out.println("Base is ready after rolling the dough");

        return new Base();
    }

}
