import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("welcome to bills burgers!");

        int burgerType = 0;
        do {
            System.out.println("Choose your burger:"
                    + "\n" + "1 - Original burger"
                    + "\n" + "2 - Healthy burger"
                    + "\n" + "3 - Deluxe burger");
            burgerType = Scanner.nextInt();
            if (burgerType < 1 || burgerType > 3) {
                System.out.println("Invalid number");
            }
        } while (burgerType < 1 || burgerType > 3);

        Hamburger hamburger;
        switch (burgerType) {
            case 1:
                System.out.println("choose bread type:");
                String breadOriginal = Scanner.nextLine();
                Scanner.nextLine();
                System.out.println("choose meat type:");
                String meatOriginal = Scanner.nextLine();
                hamburger = new Hamburger(breadOriginal, meatOriginal);
                defaultToppings(hamburger);
                break;
            case 2:
                System.out.println("choose meat type:");
                Scanner.nextLine();
                String meatHealthy = Scanner.nextLine();
                hamburger = new HealthyHamburger(meatHealthy);
                defaultToppings(hamburger);
                System.out.println("would you like to add avocado?");
                boolean avocado = check();
                if (hamburger.getClass() == HealthyHamburger.class && avocado) {
                    ((HealthyHamburger) hamburger).addAvocado();
                }
                System.out.println("would you like to add carrot?");
                boolean carrot = check();
                if (hamburger.getClass() == HealthyHamburger.class && carrot) {
                    ((HealthyHamburger) hamburger).addCarrot();
                }
                break;
            case 3:
                System.out.println("choose beard type:");
                String breadDeluxe = Scanner.nextLine();
                Scanner.nextLine();
                System.out.println("choose meat type:");
                String meatDeluxe = Scanner.nextLine();
                hamburger = new DeluxeBurger(breadDeluxe, meatDeluxe);
                defaultToppings(hamburger);
                if (hamburger.getClass() == DeluxeBurger.class) {
                    ((DeluxeBurger) hamburger).addChips();
                    ((DeluxeBurger) hamburger).addDrink();
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }

    public static boolean check() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("1 - yes" +
                "\n" + "2 - no");
        int x = Scanner.nextInt();
        return (x == 1);
    }


    public static void defaultToppings(Hamburger hamburger) {
        System.out.println("Choose your toppings:"
                + "\n" + "would you like to add lettuce?");
        boolean lettuce = check();
        if (lettuce) {
            hamburger.addLettuce();
        }
        System.out.println("would you like to add tomato?");
        boolean tomato = check();
        if (tomato) {
            hamburger.addTomato();
        }
        System.out.println("would you like to add pickles?");
        boolean pickles = check();
        if (pickles) {
            hamburger.addPickles();
        }
        System.out.println("would you like to add ketchup?");
        boolean ketchup = check();
        if (ketchup) {
            hamburger.addKetchup();
        }
    }

    public static void recipe(Hamburger hamburger) {
        System.out.println("bread type: " + hamburger.getBreadRoll());
        System.out.println("Meat type: " + hamburger.getMeat());

    }

}

