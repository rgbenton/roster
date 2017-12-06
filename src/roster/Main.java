package roster;

public class Main {

	public static void main(String[] args)
	{
		populateRoster();
		Roster.getInstance().printRoster();
	}
	
	/**
	 * Populate the roster with a list of names
	 */
	private static void populateRoster()
	{
		Roster.getInstance().addStudent("Benton, Ryan G.");
		Roster.getInstance().addStudent("Peavey, Christian I.");
	}
}
