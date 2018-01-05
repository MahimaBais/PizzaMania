package Java;

public class Oven{

    BakedFood bf;

    void start(){
        System.out.println("Java.Oven is started.");
    }


    void preHeat(int i){
        System.out.println("Java.Oven is in pre-heat process of "+i+" seconds.");

    }

    void open(){
        System.out.println("Java.Oven is opened.");

    }

    void put(Bakeable b){
        System.out.println(b+" is inside oven.");
        bf = b.bake();

    }

    void setTemperature(int d){

        System.out.println("Set temperature at "+d+" degree.");

    }

    void setTiming(int t){
        System.out.println("Set timings of "+t+" seconds.");
    }

    void stop(){
        System.out.println("Java.Oven is stopped.");
    }

    BakedFood remove(){

        System.out.println("Java.Chef is taking out the pizza.");
        return bf;

    }

}
