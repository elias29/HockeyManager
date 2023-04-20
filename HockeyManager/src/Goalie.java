
public class Goalie implements Player{
	private Integer wins;
	private String name;
	private Integer age;
	
	public Goalie(String name, Integer age, Integer wins) {
		super();
		this.name = name;
		this.age = age;
		this.wins = wins;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Integer getAge() {
		return this.age;
	}

	@Override
	public void setAge(Integer age) {
		this.age = age;
	}

	
	
}
