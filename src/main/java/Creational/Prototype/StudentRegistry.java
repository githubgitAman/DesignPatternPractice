package Creational.Prototype;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> students;

    void register(String key, Student student) {
        students.put(key, student);
    }
    Student getStudent(String key) {
        return students.get(key);
    }
}
