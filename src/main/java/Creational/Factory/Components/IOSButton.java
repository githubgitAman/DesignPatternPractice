package Creational.Factory.Components;

public class IOSButton implements Button {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
