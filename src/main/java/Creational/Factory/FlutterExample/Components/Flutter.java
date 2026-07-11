package Creational.Factory.FlutterExample.Components;

public class Flutter {
    public void refresh(){
        System.out.println("Flutter refresh");
    }
    //Method to call factory method
    public FlutterFactory getFlutterFactory(PLATFORM platform){
        //Hiding implementation using Practical Factory
        return FlutterFactoryFactory.getFlutterFactory(platform);
    }
}
