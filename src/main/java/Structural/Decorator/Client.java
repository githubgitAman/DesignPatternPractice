package Structural.Decorator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        IceCream iceCreamObject = new StrawberryScoop(
                new OrangeCone(
                        new ChocoScoop(
                                new ChocoCone()
                        )
                )
        );

        System.out.println(iceCreamObject.getCost());
        System.out.println(iceCreamObject.getDescription());
    }
}
