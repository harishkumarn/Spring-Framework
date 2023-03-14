package SpringFramework.impl;

import SpringFramework.interfaces.Employee;
import SpringFramework.interfaces.Skill;
import org.springframework.stereotype.Component;

@Component
public class EmployeeImpl implements Employee{

    String name;
    String role;
    int age;
    Skill skill;

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getRole(){
        return this.role;
    }

    @Override
    public int getAge(){
        return this.age;
    }

    @Override
    public Skill getSkill(){
        return this.skill;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setRole(String role){
        this.role = role;
    }

    @Override
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public void setSkill(Skill skill){
        this.skill = skill;
    }
}
