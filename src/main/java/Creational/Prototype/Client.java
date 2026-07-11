package Creational.Prototype;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student studentObject = studentRegistry.getStudent("BatchOne");
        Student studentCopy = studentObject.clone();
        studentCopy.setFirstName("John");
        studentCopy.setLastName("Smith");
        studentCopy.setAge(25);

        System.out.println(studentCopy);
    }
    public static void fillRegistry(StudentRegistry studentRegistry) {

        Student studentPrototype = new Student();
        studentPrototype.setAvgBatchPSP(78.0);
        studentPrototype.setBatch("Academy Nov 2025");

        studentRegistry.register("BatchOne", studentPrototype);
    }
}
