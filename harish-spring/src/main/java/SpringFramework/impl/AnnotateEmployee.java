package SpringFramework.impl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;

import SpringFramework.interfaces.Employee;
import SpringFramework.interfaces.Type;
import SpringFramework.interfaces.Skill;

@Configuration
@ComponentScan("SpringFramework.*")
public class AnnotateEmployee {
    

    @Bean("HK")
    public Employee getEmp(){
        Employee e = new EmployeeImpl();
        e.setAge(23);
        e.setName("HK");
        e.setRole("Associate Product Manager");
        Skill sk = new SkillImpl(Type.PM);
        sk.setSkills(new ArrayList<String>(){{add("Scrum");add("Agile");add("Product Management");}});
        e.setSkill(sk);
        return e;
    }
}
