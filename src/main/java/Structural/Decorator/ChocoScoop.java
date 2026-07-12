package Structural.Decorator;

public class ChocoScoop implements IceCream {
    private final IceCream iceCream;
    public ChocoScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 4.0;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", ChocoScoop";
    }
}
