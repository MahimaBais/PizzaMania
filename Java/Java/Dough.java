package Java;

public class Dough extends Food {

    Flour flour;
    Oil oil;
    Water water;

    @Override
    public String toString() {
        return "Java.Dough{" +
                "flour=" + flour +
                ", oil=" + oil +
                ", water=" + water +
                '}';
    }
}
