package structural.decorator;

public class ChickenPizza extends PizzaDecorator{

    public ChickenPizza(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + " + Chicken Toppings";
    }

    public int getPrice() {
        return pizza.getPrice() + 50;
    }

}

