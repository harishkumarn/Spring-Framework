package SpringFramework.interfaces;

import java.util.List;

public interface Skill {
    enum Type{
        DEV,
        QA,
        PM
    }
    public Skill.Type getType();
    public List<String> getSkills();

    public void setType(Skill.Type type);

    public void setSkills(List<String> skills);
}
