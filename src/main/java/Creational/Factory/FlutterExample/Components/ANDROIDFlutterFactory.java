package Creational.Factory.FlutterExample.Components;

public class ANDROIDFlutterFactory implements FlutterFactory {
    @Override
    public Button buttonType() {
        return new AndroidButton();
    }
}
