public class BaseWithCheese extends Base {

    Cheese cheese;

    CheeseBurst applyNewBase(Base b){

        System.out.println("New base is applied on base with cheese.");

        CheeseBurst cheeseBurst = new CheeseBurst();

        return cheeseBurst;
    }
}
