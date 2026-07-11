package Creational.Factory;

import Creational.Factory.Components.Button;
import Creational.Factory.Components.IOSButton;

public class IOSFlutterFactory implements FlutterFactory {
    @Override
    public Button buttonType() {
        return new IOSButton();
    }
}
