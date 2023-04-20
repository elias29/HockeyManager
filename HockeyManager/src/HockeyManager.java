import java.util.ArrayList;
import java.util.List;

public class HockeyManager {
	private List<Player> players;
	
	public HockeyManager() {
		super();
		this.players = new ArrayList<Player>();
	}

	public void AddNewForward(String name, Integer age, Integer scoredGoals){
		this.players.add(new Forward(name, age, scoredGoals));
	}
	
	public void AddNewDefender(String name, Integer age, Integer hits){
		this.players.add(new Defender(name, age, hits));
	}
	
	public void AddNewGoalie(String name, Integer age, Integer wins){
		this.players.add(new Goalie(name, age, wins));
	}
	
	public void PrintNameAndAgeOfTheYoungestPlayer(){
		Player minAgePlayer  = players.stream().min((a, b) -> {return a.getAge().compareTo(b.getAge());}).get();
		System.out.println("Name: " + minAgePlayer.getName() + " Age: " + minAgePlayer.getAge());
		//V prípade viacerých hráčov s minimálnym vekom sa vypíše ten čo bol skôr pridaný.
	}
}