package roster;

import java.util.ArrayList;

public class Roster {
	// initialize varibles
	private static Roster aRoster = null;
	
	private ArrayList<String> anArray;
	// private constructor roster ther
	private Roster()
	{
		anArray = new ArrayList<String>();
	}
	
	 public static synchronized Roster getInstance()
	 {
		 if (aRoster == null)
			 aRoster = new Roster();
		 
		 return aRoster;
	 }
	 
	 public boolean addStudent(String aStudent)
	 {
		 if (aStudent == null)
			 return false;
		 
		 if (aStudent.trim().length() == 0)
			 return false;
		 
		 anArray.add(aStudent);
		 
		 return true;
	 }
	 
	 public void printRoster()
	 {
		 System.out.println("Roster: Team ");
		 System.out.println("==========================");
		 for (String temp : anArray)
			 System.out.println(temp);
	 }
	 
	 public int getRosterSize()
	 {
		 return anArray.size();
	 }
}
