package Creational.Factory;

import Creational.Factory.Components.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        FlutterFactory factoryObject = flutter.getFlutterFactory(PLATFORM.IOS);

        Button buttonObject = factoryObject.buttonType();

        System.out.println(buttonObject);
    }
}
