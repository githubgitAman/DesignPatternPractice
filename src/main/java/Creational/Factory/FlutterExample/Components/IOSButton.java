package Creational.Factory.FlutterExample.Components;

public class IOSButton implements Button {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
