public class HealthyHamburger extends Hamburger {

    public HealthyHamburger(String meat) {
        super("Brown rye bread", meat);
        setName("healthy burger");
    }

    public void addAvocado() {
        addPrice(4);
        System.out.println("avocado has been added");
    }

    public void addCarrot() {
        addPrice(4);
        System.out.println("carrot has been added");
    }



}
