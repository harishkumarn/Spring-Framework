package SpringFramework.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import SpringFramework.interfaces.Employee;
import SpringFramework.interfaces.Skill;

@Component("harishCompoScan")
public class CompScanEmployee implements Employee{

    @Value("Harish Kumar")
    String name;

    @Value("MTS")
    String role;

    @Value("25")
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

    @Autowired
    @Qualifier("harishCompScanSkill")
    @Override
    public void setSkill(Skill skill){
        this.skill = skill;
    }
}