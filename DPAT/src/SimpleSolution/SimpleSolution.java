package SimpleSolution;

import java.util.ArrayList;
import java.util.List;

class Burger {
    private String burgerType;
    private double baseCost;

    public Burger(String burgerType) {
        this.burgerType = burgerType;

        switch (burgerType) {
            case "Beef Burger":
                this.baseCost = 5.00;
                break;
            case "Chicken Burger":
                this.baseCost = 4.50;
                break;
            case "Fish Burger":
                this.baseCost = 4.00;
                break;
            default:
                throw new IllegalArgumentException("Unknown burger type");
        }
    }

    public double getCost() {
        return baseCost;
    }

    public String getDescription() {
        return burgerType;
    }
}

class AddOn {
    private String addonType;
    private double addonCost;

    public AddOn(String addonType) {
        this.addonType = addonType;

        switch (addonType) {
            case "Cheese":
                this.addonCost = 0.75;
                break;
            case "Bacon":
                this.addonCost = 1.00;
                break;
            case "Lettuce":
                this.addonCost = 0.30;
                break;
            case "Tomato":
                this.addonCost = 0.40;
                break;
            default:
                throw new IllegalArgumentException("Unknown addon type");
        }
    }

    public double getCost() {
        return addonCost;
    }

    public String getDescription() {
        return addonType;
    }
}

class BurgerOrder {
    private Burger burger;
    private double totalcost;
    private String fulldescription;

    public BurgerOrder(Burger burger) {
        this.burger = burger;
        this.totalcost = this.burger.getCost();
        this.fulldescription = this.burger.getDescription();
    }

    public void addAddOn(AddOn addon) {
        this.totalcost += addon.getCost();
        this.fulldescription += " + " + addon.getDescription();
    }

    public double getTotalCost() {
        return totalcost;
    }

    public String getFullDescription() {
        return fulldescription;
    }
}

// Example Usage
public class SimpleSolution {
    public static void main(String[] args) {
        // Creating a burger order for Beef Burger with Cheese and Bacon
        Burger beefBurger = new Burger("Beef Burger");
        AddOn cheese = new AddOn("Cheese");
        AddOn bacon = new AddOn("Bacon");

        BurgerOrder order1 = new BurgerOrder(beefBurger);
        order1.addAddOn(cheese);
        order1.addAddOn(bacon);

        System.out.println(order1.getFullDescription()); // Output: Beef Burger, Cheese, Bacon
        System.out.println(order1.getTotalCost());       // Output: 6.75

        // Creating a burger order for Veggie Burger with Lettuce and Tomato
        Burger veggieBurger = new Burger("Veggie Burger");
        AddOn lettuce = new AddOn("Lettuce");
        AddOn tomato = new AddOn("Tomato");

        BurgerOrder order2 = new BurgerOrder(veggieBurger);
        order2.addAddOn(lettuce);
        order2.addAddOn(tomato);

        System.out.println(order2.getFullDescription()); // Output: Veggie Burger, Lettuce, Tomato
        System.out.println(order2.getTotalCost());       // Output: 4.70
    }
}
