public class DeluxeBurger extends Hamburger {
    private boolean chips;
    private boolean drink;

    public DeluxeBurger(String breadRoll, String meat) {
        super(breadRoll, meat);
        setName("Deluxe burger");
        this.chips = true;
        this.drink = true;

    }
    public void addChips() {
        addPrice(5);
        System.out.println("chips have been added, included in the deluxe package.");
    }

    public void addDrink() {
        addPrice(5);
        System.out.println("A drink has been added, included in the deluxe package.");
    }
}
