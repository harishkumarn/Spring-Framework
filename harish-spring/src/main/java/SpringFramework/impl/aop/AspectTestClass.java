package SpringFramework.impl.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import SpringFramework.interfaces.Employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import SpringFramework.impl.AnnotateEmployee;

@Aspect
@Component
public class AspectTestClass {

    @Pointcut("execution(public String getName())")
    public void pc1(){

    }

    @Pointcut("execution(public int getAge())")
    public void pc2(){}

    @Before("pc1() || pc2()")
    public void doThis(){
        System.out.println("Before pc");
    }

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotateEmployee.class);
        Employee emp = context.getBean("harishCompoScan",Employee.class);

        System.out.println(emp.getName());

        System.out.println(emp.getAge());
        
    }
}
