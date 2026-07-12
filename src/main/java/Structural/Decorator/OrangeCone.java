package Structural.Decorator;

public class OrangeCone implements IceCream{
    @Override
    public double getCost() {
        return 1.0;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
