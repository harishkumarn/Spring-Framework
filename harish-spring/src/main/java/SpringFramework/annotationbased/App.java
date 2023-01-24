package SpringFramework.annotationbased;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import SpringFramework.interfaces.Employee;
public class App {
    
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee emp = context.getBean(Employee.class,"harish");
    }

}


