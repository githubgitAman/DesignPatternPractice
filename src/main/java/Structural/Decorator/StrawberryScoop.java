package Structural.Decorator;

public class StrawberryScoop implements IceCream {
    //We cannot allow ice_cream without Cone
    private final IceCream iceCream;
    public StrawberryScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 3.0;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Strawberry Scoop";
    }
}
