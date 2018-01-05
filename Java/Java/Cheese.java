package Java;

public class Cheese extends Topping {

    public Cheese(String topping) {
        super(topping);
    }

    @Override
    public String toString() {
        return "Java.Cheese{" +
                "name='" + name + '\'' +
                '}';
    }


}
