package Creational.Factory.FlutterExample.Components;

public class AndroidButton implements Button {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
