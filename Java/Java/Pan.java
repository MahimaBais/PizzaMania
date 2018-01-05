package Java;

public class Pan {

    CookedFood cf;

    void startBurner(){
        System.out.println("Burner is started.");
    }

    void putPanOnBurner(){
        System.out.println("Java.Pan is over the burner");

    }

    void preHeatPan(){
        System.out.println("Java.Pan is heating on medium flame.");

    }

    void put(Cookable c){
        System.out.println(c+" is inside pan.");
        cf = c.bakeOnPan();
    }

    void cover(){
        System.out.println("Java.Pan is covered with vessel");

    }

    CookedFood remove(){

        System.out.println("Java.Chef is taking out the pizza.");
        return cf;

    }


}
