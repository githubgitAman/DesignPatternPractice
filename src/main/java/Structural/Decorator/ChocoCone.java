package Structural.Decorator;

public class ChocoCone implements IceCream{
    private  IceCream iceCream;
    public ChocoCone(){

    }
    public ChocoCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        if(iceCream == null) {
            return 2.0;
        }

        return iceCream.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        if(iceCream == null) {
            return "Choco Cone";
        }
        return iceCream.getDescription() + ", Choco Cone";
    }
}
