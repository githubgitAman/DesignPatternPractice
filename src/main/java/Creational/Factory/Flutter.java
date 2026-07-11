package Creational.Factory;

import Creational.Factory.Components.AndroidButton;
import Creational.Factory.Components.Button;
import Creational.Factory.Components.IOSButton;
import Creational.Factory.Components.LinuxButton;

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
