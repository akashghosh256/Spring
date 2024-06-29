package in.sp.main;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String config_loc = "/in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        //spring container will create student object himself
        // so we can directly call the display()
        Student std = (Student)context.getBean("stdId");
        std.display();
    }
}


// download jar files
// 1. spring-beans-xxx..jar
// 2. spring-core-xxx.jar
// 3. spring-context-xxx.jar
// 4. common-logging-xxx.jar
// 5. spring-expression-xxx.jar