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
        if(platform == PLATFORM.ANDROID){
            return new ANDROIDFlutterFactory();
        }
        else if(platform == PLATFORM.IOS){
            return new IOSFlutterFactory();
        }
        else if(platform == PLATFORM.LINUX){
            return new LINUXFlutterFactory();
        }

        throw new IllegalArgumentException("Unsupported platform");
    }
}
