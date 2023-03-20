package SpringFramework.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import SpringFramework.interfaces.Skill;

import SpringFramework.interfaces.Type;


@PropertySource("classpath:propsource.properties")
@Component("harishCompScanSkill")
public class CompScanSkill implements Skill{

    @Value("${skill.type}")
    Type type ;

    @Value("#{${skill.skills}}")
    List<String> skills;


    @Override
    public Type getType(){
        return this.type;
    }

    @Override
    public List<String> getSkills(){
        return this.skills;
    }

    @Override
    public void setType(Type type){
        this.type = type;
    }

    @Override
    public void setSkills(List<String> skills){
        this.skills = skills;
    }

}
