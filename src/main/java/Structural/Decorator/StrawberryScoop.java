package Structural.Decorator;

public class StrawberryScoop implements IceCream {
    @Override
    public double getCost() {
        return 3.0;
    }

    @Override
    public String getDescription() {
        return "Strawberry Scoop";
    }
}
