package SpringFramework.impl.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import SpringFramework.interfaces.Employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import SpringFramework.impl.AnnotateEmployee;

@Aspect
@Component
public class BeforeAspect {
    @Before("execution(public String getName())")
    public void doThis(){
        System.out.println("Before getName");
    }

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotateEmployee.class);
        Employee emp = context.getBean("harishCompoScan",Employee.class);

        System.out.println(emp.getName());
        
    }
}
