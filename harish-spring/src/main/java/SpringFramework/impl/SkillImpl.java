package SpringFramework.impl;

import java.util.List;


import SpringFramework.interfaces.Skill;
import SpringFramework.interfaces.Type;

public class SkillImpl implements Skill {

    Type type;
    List<String> skills;

    public SkillImpl(Type type){
        this.type = type;
    }

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
