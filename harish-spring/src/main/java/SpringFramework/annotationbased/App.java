package SpringFramework.annotationbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import SpringFramework.impl.AnnotateEmployee;

import SpringFramework.interfaces.Employee;

public class App {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotateEmployee.class);

        Employee emp = context.getBean("harishCompoScan",Employee.class);

        System.out.println("Name : "  + emp.getName());
        System.out.println("Role : " + emp.getRole());
        System.out.println("Age : " + emp.getAge());

        System.out.println("Skill : " + emp.getSkill().getType());

        for(String sk  : emp.getSkill().getSkills()){
            System.out.println(sk);
        }
    }
}
