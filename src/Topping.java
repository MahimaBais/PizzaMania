public class Topping extends Food{

    String name;

    public Topping(String topping) {
        name = topping;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                '}';
    }
}
