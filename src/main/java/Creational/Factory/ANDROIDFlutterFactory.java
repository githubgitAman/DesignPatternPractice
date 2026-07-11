package Creational.Factory;

import Creational.Factory.Components.AndroidButton;
import Creational.Factory.Components.Button;

public class ANDROIDFlutterFactory implements FlutterFactory {
    @Override
    public Button buttonType() {
        return new AndroidButton();
    }
}
