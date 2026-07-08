package Creational.Builder;

public class Client {
    public static void main(String[] args) {
        BuilderClassHelper helperInstance = new BuilderClassHelper();
        helperInstance.setFirstName("John");
        helperInstance.setLastName("Doe");
//        helperInstance.setAge(23);

        BuilderClass instance = new BuilderClass(helperInstance);
        System.out.println(instance.getFirstName());
        System.out.println(instance.getLastName());
//        System.out.println(instance.getAge());

        BuilderClassHelper helperInstanceTwo = new BuilderClassHelper();
        helperInstanceTwo.setFirstName("Tony");
        helperInstanceTwo.setLastName("Z");

        BuilderClass instanceTwo = new BuilderClass(helperInstanceTwo);
        System.out.println(instanceTwo.getFirstName());
        System.out.println(instanceTwo.getLastName());

    }
}
