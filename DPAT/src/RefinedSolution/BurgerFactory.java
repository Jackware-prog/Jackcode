package RefinedSolution;

// Abstract Product
interface Burger {
    public double getCost();
    public String getDescription();
}

// Concrete Products
class BeefBurger implements Burger {
    public double getCost() {
        return 5.00;
    }

    public String getDescription() {
        return "Beef Burger";
    }
}

class ChickenBurger implements Burger {
    public double getCost() {
        return 4.50;
    }

    public String getDescription() {
        return "Chicken Burger";
    }
}

class FishBurger implements Burger {
    public double getCost() {
        return 4.00;
    }

    public String getDescription() {
        return "Fish Burger";
    }
}

// Factory
public class BurgerFactory {
    public Burger createBurger(String burgertype){
        if(burgertype == null){
            return null;
        }
        if(burgertype.equalsIgnoreCase("Beef")){
            return new BeefBurger();

        } else if(burgertype.equalsIgnoreCase("Chicken")){
            return new ChickenBurger();

        } else if(burgertype.equalsIgnoreCase("Fish")){
            return new FishBurger();
        }

        return null;
    }
}
