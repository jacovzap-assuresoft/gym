public class Member
{
    String name;
    String lastName;
    String gender;
    int age;

    public Member(String name, String lastName, String gender, int age)
    {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String getFullName()
    {
        return name + " " + lastName;
    }

    public String getGender()
    {
        return gender;
    }

    public int getAge()
    {
        return age;
    }
}
