package Creational.Builder;

public class Client {
    public static void main(String[] args) {
        //Creating abstraction by not directly creating Builder class object
        BuilderClassHelper helperInstance = BuilderClass.getBuilder();
        helperInstance.setFirstName("John");
        helperInstance.setLastName("Doe");
        helperInstance.setAge(24);
        //Calling build method of Helper class
        BuilderClass instance = helperInstance.build();
        System.out.println(instance.getFirstName());
        System.out.println(instance.getLastName());
        System.out.println(instance.getAge());
    }
}
