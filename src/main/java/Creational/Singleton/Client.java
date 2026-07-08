package Creational.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        SingletonClass instanceOne = SingletonClass.getInstance();
        SingletonClass instanceTwo = SingletonClass.getInstance();
        System.out.println(instanceOne == instanceTwo);
    }
}
