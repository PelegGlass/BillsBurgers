public class Hamburger {
    private double price;
    private String name;
    private String breadRoll;
    private String meat;

    public Hamburger() {
        this("default bread", "default meat");
    }

    public Hamburger(String breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.name = "original burger";
        this.price = 10;
    }

    public void addLettuce() {
        addPrice(2);
        System.out.println("lettuce has been added");
    }

    public void addTomato() {
        addPrice(2);
        System.out.println("Tomato has been added");
    }

    public void addPickles() {
        addPrice(2);
        System.out.println("Pickles have been added");
    }

    public void addKetchup() {
        addPrice(2);
        System.out.println("Ketchup has been added");
    }


    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        System.out.println("price = " + price);
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPrice(double price) {
        this.price = this. price + price;
    }
}
