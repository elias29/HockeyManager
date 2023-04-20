
public class Main {

	public static void main(String[] args) {
		HockeyManager hm = new HockeyManager();
		hm.AddNewDefender("Jozo Mrkva", 29, 5);
		hm.AddNewDefender("Jozo Zemiak", 23, 4);
		hm.AddNewForward("Fero Zemiak", 20, 4);
		hm.AddNewGoalie("Michal Petrzlen", 20, 4);
		hm.PrintNameAndAgeOfTheYoungestPlayer();
	}

}
