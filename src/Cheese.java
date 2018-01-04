public class Cheese extends Topping {

    public Cheese(String topping) {
        super(topping);
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                '}';
    }


}
