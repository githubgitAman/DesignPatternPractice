package Structural.Decorator;

public class OrangeCone implements IceCream{

    private  IceCream iceCream;
    public OrangeCone(){

    }
    public OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        if(iceCream == null) {
            return 1.0;
        }

        return iceCream.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        if(iceCream == null) {
            return "Orange Cone";
        }
        return iceCream.getDescription() + ", Orange Cone";
    }
}
