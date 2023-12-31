import java.util.List;
import java.util.ArrayList;

public class Discipline
{
    private String name;
    private List<Group> groups = new ArrayList<Group>();

    public Discipline(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

        public List<Group> getGroups()
    {
        return groups;
    }

    public void addGroup(Group group)
    {
        groups.add(group);
    }
}
