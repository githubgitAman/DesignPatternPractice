package Creational.Factory;

public class FlutterFactoryFactory {
    public static FlutterFactory getFlutterFactory(PLATFORM platform) {
        if(platform == PLATFORM.ANDROID){
            return new ANDROIDFlutterFactory();
        }
        else if(platform == PLATFORM.IOS){
            return new IOSFlutterFactory();
        }
        else if(platform == PLATFORM.LINUX){
            return new LINUXFlutterFactory();
        }

        throw new IllegalArgumentException("Unsupported platform");
    }
}
