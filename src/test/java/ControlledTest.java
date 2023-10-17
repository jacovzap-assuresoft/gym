import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class ControlledTest
{
    @Test
    public void testConstructor()
    {
        Controlled controlled = new Controlled(6, 7);
        assertNotNull(controlled);
    }

    @Test
    public void testConstructorInstance()
    {
        Controlled controlled = new Controlled(6, 7);
        assertThat(controlled, instanceOf(Controlled.class));
    }

    @Test
    public void testGetMembers()
    {
        Controlled controlled = new Controlled(11, 12);
        Member firstMember = Mockito.mock(Member.class);
        Member secondMember = Mockito.mock(Member.class);

        controlled.addMember(firstMember);
        controlled.addMember(secondMember);

        assertEquals(2, controlled.getMembers().size());
    }

    @Test
    public void testCheckAttendance()
    {
        Controlled controlled = new Controlled(8, 9);
        Member firstMember = Mockito.mock(Member.class);
        Member secondMember = Mockito.mock(Member.class);

        Mockito.when(firstMember.getFullName()).thenReturn("Daniel Perez");
        Mockito.when(secondMember.getFullName()).thenReturn("Maria Rojas");

        controlled.addMember(firstMember);
        controlled.addMember(secondMember);
        controlled.checkAttendance();
    }

    @Test
    public void testCalculateMembersAverageAge()
    {
        Controlled controlled = new Controlled(10, 11);
        Member firstMember = Mockito.mock(Member.class);
        Member secondMember = Mockito.mock(Member.class);

        Mockito.when(firstMember.getAge()).thenReturn(20);
        Mockito.when(secondMember.getAge()).thenReturn(30);

        controlled.addMember(firstMember);
        controlled.addMember(secondMember);

        assertEquals(25.0, controlled.calculateTheAverageAgeOfMembers(), 0.0);
    }

    @Test
    public void testAddMember()
    {
        Controlled controlled = new Controlled(7, 8);
        Member member = Mockito.mock(Member.class);
        controlled.addMember(member);

        assertEquals(1, controlled.getMembers().size());
    }
}
