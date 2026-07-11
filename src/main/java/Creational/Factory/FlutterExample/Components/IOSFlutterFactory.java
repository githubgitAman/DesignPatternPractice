package Creational.Factory.FlutterExample.Components;

public class IOSFlutterFactory implements FlutterFactory {
    @Override
    public Button buttonType() {
        return new IOSButton();
    }
}
