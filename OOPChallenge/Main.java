package OOPChallenge;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger =  new Hamburger("Basic", "sausage", 3.25, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato", 0.25);
        hamburger.addHamburgerAddition2("lettuce", 0.35);
        hamburger.addHamburgerAddition3("cheese", 1.25);
        hamburger.addHamburgerAddition4("mayo", 0.25);
        System.out.println("Total burger price is $" + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 3.50);
        healthyBurger.addHealthAddition1("Avocado", 1.25);
        healthyBurger.addHealthAddition2("Ketchup", 0.25);
        System.out.println("Total healthy Burger Price is $"+healthyBurger.itemizeHamburger());

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.itemizeHamburger();
    }
}
