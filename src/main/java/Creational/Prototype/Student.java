package Creational.Prototype;

public class Student implements Prototype<Student> {
    private String firstName;
    private String lastName;
    private int age;
    private Double avgBatchPSP;
    private String batch;

    //Default Constructor
    public Student(){

    }
    //Parameterized Constructor
    public Student(Student student){
        this.setFirstName(student.getFirstName());
        this.setLastName(student.getLastName());
        this.setAge(student.getAge());
        this.setAvgBatchPSP(student.getAvgBatchPSP());
        this.setBatch(student.getBatch());
    }

    //Copy method to create copy of object
    public Student clone(){
        return new Student(this);
    }

    public Double getAvgBatchPSP() {
        return avgBatchPSP;
    }

    public void setAvgBatchPSP(Double avgBatchPSP) {
        this.avgBatchPSP = avgBatchPSP;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
