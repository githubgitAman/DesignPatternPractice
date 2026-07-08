package Creational.Singleton;

public class Client {
    public static void main(String[] args) {

        SingletonClass instance = SingletonClass.getInstance();
        instance.setAge(23);
        instance.setFirstName("John");
        instance.setLastName("Smith");

        System.out.println(instance.getAge());
        System.out.println(instance.getFirstName());
        System.out.println(instance.getLastName());

        SingletonClass instanceTwo = SingletonClass.getInstance();
        instanceTwo.setAge(25);
        instanceTwo.setFirstName("John");
        instanceTwo.setLastName("Smith");

        System.out.println(instanceTwo.getAge());
        System.out.println(instanceTwo.getFirstName());
        System.out.println(instanceTwo.getLastName());
    }
}
