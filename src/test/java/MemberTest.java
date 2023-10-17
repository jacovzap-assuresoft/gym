import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class MemberTest
{
    @Test
    public void testConstructor()
    {
        Member member = new Member("Daniel", "Perez", "male", 22);
        assertNotNull(member);
    }

    @Test
    public void testConstructorInstance()
    {
        Member member = new Member("Daniel", "Perez", "male", 22);
        assertThat(member, instanceOf(Member.class));
    }

    @Test
    public void testGetFullName()
    {
        Member member = new Member("Joan", "Adams", "male", 45);
        assertEquals("Joan Adams", member.getFullName());
    }

    @Test
    public void testGetGender()
    {
        Member member = new Member("Paul", "Smith", "male", 27);
        assertEquals("male", member.getGender());
    }

    @Test
    public void testGetAge()
    {
        Member member = new Member("Rose", "Davies", "female", 33);
        assertEquals(33, member.getAge());
    }
}
