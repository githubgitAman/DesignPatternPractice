package Creational.Factory;

import Creational.Factory.Components.Button;
import Creational.Factory.Components.LinuxButton;

public class LINUXFlutterFactory implements FlutterFactory {
    @Override
    public Button buttonType() {
        return new LinuxButton();
    }
}
