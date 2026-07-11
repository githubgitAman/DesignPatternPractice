package Creational.Factory;

import Creational.Factory.Components.AndroidButton;
import Creational.Factory.Components.Button;
import Creational.Factory.Components.IOSButton;
import Creational.Factory.Components.LinuxButton;

public class Flutter {
    public void refresh(){
        System.out.println("Flutter refresh");
    }
    public Button buttonType(PLATFORM platform){
        if(platform.equals(PLATFORM.ANDROID)){
            return new AndroidButton();
        }
        else if(platform.equals(PLATFORM.IOS)){
            return new IOSButton();
        }
        else if(platform.equals(PLATFORM.LINUX)){
            return new LinuxButton();
        }

        throw new IllegalArgumentException("Unsupported platform");
    }
}
