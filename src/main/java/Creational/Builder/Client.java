package Creational.Builder;

public class Client {
    public static void main(String[] args) {
        BuilderClass instance = BuilderClass.getBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(25)
                .build();

        System.out.println(instance.getFirstName());
        System.out.println(instance.getLastName());
        System.out.println(instance.getAge());
    }
}
