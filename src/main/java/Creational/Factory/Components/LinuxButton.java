package Creational.Factory.Components;

public class LinuxButton implements Button {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
