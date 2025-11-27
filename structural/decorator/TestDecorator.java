package structural.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        System.out.println(pizza.getDescription() + " " + "$"+pizza.getPrice());
        pizza = new ChickenPizza(pizza);
        pizza = new PaneerPizza(pizza);
        System.out.println(pizza.getDescription() + " " + "$"+pizza.getPrice());
    }
}
