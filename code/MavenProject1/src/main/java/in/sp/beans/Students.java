package in.sp.beans;

public class Students {
    private String Name;
    private int rollno;
    private float marks;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void display(){
        System.out.println("Name: "+Name);
        System.out.println("Rollno: "+rollno);
        System.out.println("Marks: "+marks);
    }


}