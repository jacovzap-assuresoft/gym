import java.util.List;
import java.util.ArrayList;

public class Gym {
    public static void main(String[] args)
    {
        // Create gym members
        Member member1 = new Member("Joan", "Adams", "male", 20);
        Member member2 = new Member("Jane", "Brown", "female", 22);
        Member member3 = new Member("Paul", "Smith", "male", 27);
        Member member4 = new Member("Maria", "Wilson", "female", 26);
        Member member5 = new Member("Rose", "Davies", "female", 26);
        Member member6 = new Member("Peter", "Johnson", "male", 30);

        List<Member> memberList = new ArrayList<>(List.of(member1, member2, member3, member4, member5, member6));

        // Create Disciplines
        Discipline discipline1 = new Discipline("Crossfit");

        // Create groups
        Open group1 = new Open(6, 7);
        Open group2 = new Open(7, 8);
        Controlled group3 = new Controlled(8, 9);

        // Assign members to groups
        group1.addMember(member1);
        group1.addMember(member2);

        group2.addMember(member3);
        group2.addMember(member4);

        group3.addMember(member3);
        group3.addMember(member4);
        group3.addMember(member5);
        group3.addMember(member6);

        // Assign groups to disciplines
        discipline1.addGroup(group1);
        discipline1.addGroup(group2);
        discipline1.addGroup(group3);

        // Check attendance of 3rd group in the class of crossfit
        System.out.println("Checking attendance of group 3...");
        group3.checkAttendance();

        // Calculate the average age of the group 2
        System.out.println("The average age of the group 2 is: " + group2.calculateMembersAverageAge());

        // Filter all the male gym members
        System.out.println("All the male gym members:");

        memberList.stream()
            .filter(member -> "male".equals(member.getGender()))
            .forEach(member -> System.out.println(member.getFullName()));

        // Filter all the gym members that are older than 25 years old
        System.out.println("All the gym members that are older than 25 years old:");
        memberList.stream()
            .filter(member -> member.getAge() > 25)
            .forEach(member -> System.out.println(member.getFullName()));
    }
}

// PROBLEM STATEMENT

// A gym wants a computerized system to control and monitor the sports
// disciplines offered to its members.
// The same discipline can have several groups at different times.
// The members can choose the disciplines and register to one or more groups.

// There are two types of groups:
// - Free, with a limit of 20 members.
// - Controlled, has a quota limit of 20 members whose attendance is controlled.
