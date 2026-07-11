package Creational.Prototype;

public class IntelligentStudent extends Student {
    private int iq;
    //Default Constructor
    public IntelligentStudent() {

    }
    //Parameterized Constructor
    public IntelligentStudent(IntelligentStudent student) {
        //Copying parent attributes
        super(student);
        if(student != null) {
            this.iq = student.getIq();
        }
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
