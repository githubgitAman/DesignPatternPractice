package Creational.Factory.FlutterExample.Components;

public class LINUXFlutterFactory implements FlutterFactory {
    @Override
    public Button buttonType() {
        return new LinuxButton();
    }
}
