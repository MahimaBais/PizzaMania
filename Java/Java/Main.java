package Java;

public class Main {

    public static void main(String args[]){

        //Assign an object of Java.Consumer class in instance variable name 'consumer'
        Consumer consumer = new Consumer();

        //
        consumer.name = "Misha";

        Chef chef = new Chef();
        chef.name = "Rhea";

        Pizza pizza = consumer.placeOrder(chef);


        consumer.eat(pizza);

    }
}

