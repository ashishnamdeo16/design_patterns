package structural;

public class PaneerPizza extends PizzaDecorator{

    public PaneerPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Paneer Toppings";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 30;
    }
}
