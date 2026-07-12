package Structural.Decorator;

public class ChocoScoop implements IceCream {
    @Override
    public double getCost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Choco Scoop";
    }
}
