package RefinedSolution;

public class RefinedSolution {
    public static void main(String[] args) {
        // Create a Beef Burger with Cheese and Bacon using Factory and Decorator patterns
        BurgerFactory burgerfactory = new BurgerFactory();
        Burger beefBurger = burgerfactory.createBurger("Beef");

        Burger beefBurgerWithCheeseAndBacon = new BaconDecorator(new CheeseDecorator(beefBurger));
        System.out.println(beefBurgerWithCheeseAndBacon.getDescription()); // Output: Beef Burger, Cheese, Bacon
        System.out.println(beefBurgerWithCheeseAndBacon.getCost());        // Output: 6.75

        // Create a Fish Burger with Lettuce and Tomato
        Burger fishBurger = burgerfactory.createBurger("Fish");

        Burger fishBurgerWithLettuceAndTomato = new TomatoDecorator(new LettuceDecorator(fishBurger));
        System.out.println(fishBurgerWithLettuceAndTomato.getDescription()); // Output: Veggie Burger, Lettuce, Tomato
        System.out.println(fishBurgerWithLettuceAndTomato.getCost());        // Output: 4.70
    }
}
