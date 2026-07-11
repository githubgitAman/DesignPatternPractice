package Creational.Prototype;

public class Client {
    public static void main(String[] args) {
        Student student = new IntelligentStudent();
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setAge(25);

        Student studentClone = student.clone();
        System.out.println(studentClone);
    }
}
