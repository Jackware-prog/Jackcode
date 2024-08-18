package RefinedSolution;

abstract class BurgerDecorator implements Burger {
    protected Burger decoratedBurger;

    public BurgerDecorator(Burger decoratedBurger) {
        this.decoratedBurger = decoratedBurger;
    }

    public double getCost() {
        return decoratedBurger.getCost();
    }

    public String getDescription() {
        return decoratedBurger.getDescription();
    }
}

class CheeseDecorator extends BurgerDecorator {
    public CheeseDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    public double getCost() {
        return decoratedBurger.getCost() + 0.75;
    }

    public String getDescription() {
        return decoratedBurger.getDescription() + ", Cheese";
    }
}

class BaconDecorator extends BurgerDecorator {
    public BaconDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    public double getCost() {
        return decoratedBurger.getCost() + 1.00;
    }

    public String getDescription() {
        return decoratedBurger.getDescription() + ", Bacon";
    }
}

class LettuceDecorator extends BurgerDecorator {
    public LettuceDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    public double getCost() {
        return decoratedBurger.getCost() + 0.30;
    }

    public String getDescription() {
        return decoratedBurger.getDescription() + ", Lettuce";
    }
}

class TomatoDecorator extends BurgerDecorator {
    public TomatoDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    public double getCost() {
        return decoratedBurger.getCost() + 0.40;
    }

    public String getDescription() {
        return decoratedBurger.getDescription() + ", Tomato";
    }
}