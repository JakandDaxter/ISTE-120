/**
 Course: STE-120-<1>
 Exam: Practical 1, Question #1
 Description: A class to test the Athlete, Team & League classes
 @author Aliana Tejeda
 @version 02/19/2021
 */

package sportsLeague;


public class TestSportsLeague {
	public static void main(String[] args) {

		// Creating The Athlete Object instances
		Athlete anth1 = new Athlete();
		Athlete anth2 = new Athlete();

		//Creating the Team Object for each player
		Team BB = new Team();

		//Creating League Object
		League LL = new League("NFL",anth1,BB);


		//settings the athlets name
		anth1.setName("Josh Allen");
		anth2.setName("Jordan Poyer");

		//settings the athlets number
		anth1.setUniformNum(17);
		anth2.setUniformNum(21);

		//Creating Team
		BB.setTeamName("Buffalo Bills");
		BB.setCaptain(anth2);


		LL.printLeagueInfo();



	}
}