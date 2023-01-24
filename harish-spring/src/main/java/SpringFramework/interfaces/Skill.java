package SpringFramework.interfaces;

import java.util.List;

public interface Skill {
   
    public Type getType();
    public List<String> getSkills();

    public void setType(Type type);

    public void setSkills(List<String> skills);
}
