package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// java bean class
public class Student {

    @Value("Akash G")
    private String name;
    @Value("44444")
    private int rollno;
    @Value("akashg@gmail.com")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println("name: "+name);
        System.out.println("rollno: "+rollno);
        System.out.println("email: "+email);
    }


}
