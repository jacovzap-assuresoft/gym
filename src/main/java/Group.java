import java.util.List;
import java.util.ArrayList;

public abstract class Group
{
    private int startHour;
    private int endHour;
    private int MAX_MEMBERS = 20;
    private List<Member> members = new ArrayList<Member>();

    public Group(int startHour, int endHour)
    {
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public List<Member> getMembers()
    {
        return members;
    }

    public void addMember(Member member)
    {
        if (members.size() < MAX_MEMBERS)
        {
            members.add(member);
            return;
        }
        System.out.println("Group is full");
        return;
    }

    // calculate the average age of the members, format it to 1 decimal places and return it
    public double calculateMembersAverageAge()
    {
        int sumOfAges = members
        .stream()
        .reduce(0, (sum, member) -> sum + member.getAge(), Integer::sum);
        return sumOfAges / (double)(members.size());
    }
}
