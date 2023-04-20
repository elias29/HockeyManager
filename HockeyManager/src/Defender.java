
public class Defender implements Player{
	private Integer hits;
	private String name;
	private Integer age;
	
	public Defender(String name, Integer age, Integer hits) {
		super();
		this.hits = hits;
		this.name = name;
		this.age = age;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
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
