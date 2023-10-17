import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class DisciplineTest
{
    @Test
    public void testConstructorNotNull()
    {
        Discipline discipline = new Discipline("Spinning");
        assertNotNull(discipline);
    }

    @Test
    public void testConstructorInstance()
    {
        Discipline discipline = new Discipline("Spinning");
        assertThat(discipline, instanceOf(Discipline.class));
    }

    @Test
    public void testGetName()
    {
        Discipline discipline = new Discipline("Zumba");
        assertEquals("Zumba", discipline.getName());
    }

    @Test
    public void testGetGroups()
    {
        Discipline discipline = new Discipline("Crossfit");
        Group firstGroup = Mockito.mock(Group.class);
        Group secondGroup = Mockito.mock(Group.class);

        discipline.addGroup(firstGroup);
        discipline.addGroup(secondGroup);

        assertEquals(2, discipline.getGroups().size());
    }

    @Test
    public void testAddGroup()
    {
        Discipline discipline = new Discipline("Yoga");
        Group group = Mockito.mock(Group.class);

        discipline.addGroup(group);

        assertEquals(1, discipline.getGroups().size());
    }
}
