package OOPChallenge;

public class HealthyBurger extends Hamburger {

    private String healthyExtraName;
    private double healthyExtraPrice;

    private String healthyExtraName2;
    private double healthyExtraPrice2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");

    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthyExtraName2 = name;
        this.healthyExtraPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtraName != null){
            hamburgerPrice += this.healthyExtraPrice;
            System.out.println(healthyExtraName + " added for $" + healthyExtraPrice);
        }
        if(this.healthyExtraName2 != null){
            hamburgerPrice += this.healthyExtraPrice2;
            System.out.println(healthyExtraName2 + " added for $" + healthyExtraPrice2);
        }
        return hamburgerPrice;
    }
}
