package roster;

import org.junit.Test;

import junit.framework.TestCase;

public class RosterTest extends TestCase {

	@Test
	public void testInitial() {
		int it = Roster.getInstance().getRosterSize();
		assert (it == 1);	
	}
	
	@Test
	public void testAdd() {
		Roster.getInstance().addStudent(null);
		int it = Roster.getInstance().getRosterSize();
		assert (it == 1);

		Roster.getInstance().addStudent("");
		it = Roster.getInstance().getRosterSize();
		assert (it == 1);

		Roster.getInstance().addStudent("Gogo");
		it = Roster.getInstance().getRosterSize();
		assert (it == 2);
	}
}
