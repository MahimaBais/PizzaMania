package Java;

public class Topping extends Food{

    String name;

    public Topping(String topping) {
        name = topping;
    }

    @Override
    public String toString() {
        return "Java.Topping{" +
                "name='" + name + '\'' +
                '}';
    }
}
