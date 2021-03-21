package sportsLeague;// Athlete

public class Athlete 
{
	// attributes
	private int uniformNum;
	private String name;

	// constructor
	public Athlete() 
   {
		name = "Unknown";
		uniformNum = -1;
	}
   
	public Athlete(String aName, int aUniformNum) 
   {
		name = aName;
		uniformNum = aUniformNum;
	}

	// accessors
	public String getName() 
   {
		return name;
	}

	public int getUniformNum() 
   {
		return uniformNum;
	}

	//mutators
	public void setName(String aName) 
   {
		name = aName;
	}

	public void setUniformNum(int num) 
   {
		uniformNum = num;
	}
}

