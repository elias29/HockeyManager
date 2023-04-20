
public class Forward implements Player {
	private Integer scoredGoals;
	private String name;
	private Integer age;
	
	public Forward(String name, Integer age, Integer scoredGoals) {
		super();
		this.scoredGoals = scoredGoals;
		this.name = name;
		this.age = age;
	}
	
	public Integer getScoredGoals() {
		return scoredGoals;
	}

	public void setScoredGoals(Integer scoredGoals) {
		this.scoredGoals = scoredGoals;
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
