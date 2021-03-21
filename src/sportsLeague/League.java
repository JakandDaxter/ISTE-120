package sportsLeague;// League

public class League 
{
	// attributes
	private String leagueName;
	private Athlete mvp;
	private Team sportsTeam;

	// constructor
	public League() 
   {
      leagueName = "Unknown";
	}
	
   public League(String aName, Athlete anAthlete, Team aTeam) 
   {
		leagueName = aName;
		mvp = anAthlete;
		sportsTeam = aTeam;
	}

	// accessors
	public String getLeagueName() 
   {
		return leagueName;
	}

	//mutators
	public void setLeagueName(String aName) 
   {
		leagueName = aName;
	}

	// print dept info
	public void printLeagueInfo()
   {
		System.out.println("Team Name: " + sportsTeam.getTeamName());
		System.out.println("Team Captain Name: " + sportsTeam.getCaptain().getName());
		System.out.println("Team Captain uniform #: " + sportsTeam.getCaptain().getUniformNum());
		System.out.println();
		System.out.println("League Name: " + leagueName);
		System.out.println("League MVP Name: " + mvp.getName());
		System.out.println("MVP uniform #: " + mvp.getUniformNum());
	}
}