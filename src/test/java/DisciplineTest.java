import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

public class DisciplineTest {

    @Test
    public void testAddGroup() {
        Discipline discipline = new Discipline("Yoga");
        Group group = Mockito.mock(Group.class);
        discipline.addGroup(group);
        assertEquals(1, discipline.getGroups().size());
    }

    @Test
    public void testGetGroups() {
        Discipline discipline = new Discipline("Crossfit");

        Group firstGroup = Mockito.mock(Group.class);
        Group secondGroup = Mockito.mock(Group.class);

        discipline.addGroup(firstGroup);
        discipline.addGroup(secondGroup);
        assertEquals(2, discipline.getGroups().size());
    }
}
