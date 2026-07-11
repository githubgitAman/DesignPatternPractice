package Creational.Factory.FlutterExample.Components;

public class LinuxButton implements Button {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
