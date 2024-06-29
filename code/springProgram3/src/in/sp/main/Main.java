package in.sp.main;
import in.sp.beans.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// add spring AOP jar file

public class Main {
    public static void main(String[] args) {

        String resource_file_path = "/in/sp/resources/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);



        //spring container will create student object himself
        // so we can directly call the display()

        Student std = (Student)context.getBean("student");

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