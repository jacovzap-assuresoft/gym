import java.util.List;
import java.util.stream.Collectors;

public class Controlled extends Group
{
    public Controlled(int startHour, int endHour)
    {
        super(startHour, endHour);
    }

    public void checkAttendance()
    {
        // get all the names of the members in the group
        List<String> memberNames = getMembers().stream()
            .map(member -> {
                return member.getFullName();
            })
            .collect(Collectors.toList());

        // print the names of the members in the group
        memberNames.forEach(members -> {
            System.out.println(members + " is present");
        });
    }
}
