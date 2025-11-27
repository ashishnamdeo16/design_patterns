package structural.decorator;

public class SimplePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Simple Pizza";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
