package in.sp.main;

import in.sp.resources.*;
import in.sp.beans.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String configlocation = "in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configlocation);
        Students std = context.getBean(Students.class);
        std.display();
    }

}