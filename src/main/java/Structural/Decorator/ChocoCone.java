package Structural.Decorator;

public class ChocoCone implements IceCream{
    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Choco Cone";
    }
}
