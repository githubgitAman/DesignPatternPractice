package Creational.Factory;

import Creational.Factory.Components.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        Button createdButton = flutter.buttonType(PLATFORM.ANDROID);

        System.out.println(createdButton);
    }
}
