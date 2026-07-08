package Creational.Singleton;

import java.util.concurrent.locks.ReentrantLock;

public class SingletonClass {
    private int age;
    private String firstName;
    private String lastName;

    //Instance of class
    private static SingletonClass singletonClassInstance = null;
    //Making constructor private
    private SingletonClass() {}
    //Applying lock
    private static ReentrantLock lock = new ReentrantLock();
    //Creating method to getInstance
    public static  SingletonClass getInstance() {
        if (singletonClassInstance == null) {
            lock.lock();
            if(singletonClassInstance == null)
            {
                singletonClassInstance = new SingletonClass();
            }
            lock.unlock();
        }
        return singletonClassInstance;
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
