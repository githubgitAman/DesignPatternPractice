package Creational.Builder;

public class BuilderClass {
    private String firstName;
    private String lastName;
    private int age;

    public BuilderClass(BuilderClassHelper builderClassHelper) {
        this.firstName = builderClassHelper.getFirstName();
        this.lastName = builderClassHelper.getLastName();
        this.age = builderClassHelper.getAge();
    }

    public static BuilderClassHelper getBuilder(){
        return new BuilderClassHelper();
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
