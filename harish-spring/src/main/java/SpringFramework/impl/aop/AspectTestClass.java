package SpringFramework.impl.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import SpringFramework.interfaces.Employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.context.ApplicationContext;
import SpringFramework.impl.AnnotateEmployee;

import java.util.Arrays;

@Aspect
@Component
@Order(1)
public class AspectTestClass {

    @Pointcut("execution(public String getName())")
    public void pc1(){

    }

    @Pointcut("execution(public int getAge())")
    public void pc2(){}

    @Before("pc1() || pc2()")
    public void doThis(){
        System.out.println("Before get");
    }

    @Before("execution(* set*(..))")
    public void preSet(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println("Printing arguments from preSet");
        Arrays.stream(args).forEach(System.out::println);
    }

    @AfterReturning(pointcut = "execution(* getAge(..))", returning =  "val")
    public void postGet(Integer val){  
        System.out.println("After getting " + val);
    }

    @AfterThrowing(pointcut = "execution(* getAge(..))", throwing = "e")
    public void postGetThrow(Exception e){
        System.out.println("After throwing " + e);
    }

    @After("execution(* getAge(..))")
    public void postGet(){
        System.out.println("Pseudo finally block ( after get )");
    }

    @Around("execution(* getAge(..))")
    public Object aroundGet(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("Around get");
        Object obj = jp.proceed();
        return obj;
    }

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotateEmployee.class);
        Employee emp = context.getBean("harishCompoScan",Employee.class);



      //  System.out.println(emp.getName());

        System.out.println(emp.getAge());

        emp.setAge(69);
        
    }
}
