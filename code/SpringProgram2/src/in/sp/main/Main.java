package in.sp.main;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


// add spring AOP jar file

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);



        //spring container will create student object himself
        // so we can directly call the display()

        //Student std = (Student)context.getBean("stdId1");
        Student std = (Student)context.getBean("HoneySingh");

        std.display();



    }
}


// download jar files all file version should be same
// 1. spring-beans-xxx..jar
// 2. spring-core-xxx.jar
// 3. spring-context-xxx.jar
// 4. common-logging-xxx.jar
// 5. spring-expression-xxx.jar

// + 6. spring-AOP-xxx.jar