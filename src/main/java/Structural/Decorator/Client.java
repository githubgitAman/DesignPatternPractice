package Structural.Decorator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<IceCream> iceCreamIngredients = new ArrayList<>();
        iceCreamIngredients.add(new ChocoCone());
        iceCreamIngredients.add(new StrawberryScoop());
        iceCreamIngredients.add(new ChocoScoop());
        double cost = 0.0;

        for(int i=0; i<iceCreamIngredients.size(); i++){
            cost = cost + iceCreamIngredients.get(i).getCost();
        }
        System.out.println(cost);
        for(int i=0; i<iceCreamIngredients.size(); i++){
            String description = iceCreamIngredients.get(i).getDescription();
            System.out.println(description);
        }
    }
}
