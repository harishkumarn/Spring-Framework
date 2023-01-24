package SpringFramework.impl;

import java.util.List;
import SpringFramework.interfaces.Skill;

public class SkillImpl implements Skill {

    Skill.Type type;
    List<String> skills;

    public SkillImpl(Skill.Type type){
        this.type = type;
    }

    @Override
    public Skill.Type getType(){
        return this.type;
    }

    @Override
    public List<String> getSkills(){
        return this.skills;
    }

    @Override
    public void setType(Skill.Type type){
        this.type = type;
    }

    @Override
    public void setSkills(List<String> skills){
        this.skills = skills;
    }

}
