package in.sp.resources;

import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringConfigFile {
    @Bean("HoneySingh")
    public Student stdId1(){

        Student std = new Student();
        std.setName("Ghosh");
        std.setRollno(4444);
        std.setEmail("ghosh@gmail.com");
        return std;
    }

}
