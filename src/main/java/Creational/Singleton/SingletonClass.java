package Creational.Singleton;

public class SingletonClass {
    private int age;
    private String firstName;
    private String lastName;

    //Instance of class
//    private SingletonClass singletonClassInstance = null;
    //Making constructor private
    private SingletonClass() {

    }
    //Creating method to getInstance
    public static SingletonClass getInstance() {
        return new SingletonClass();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
