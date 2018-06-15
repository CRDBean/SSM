package entity;

public class Student {
	
	private int id;
	private Integer age;
	private Integer score;
	private String name;
	public Student() {		
	}
	public Student(String name,Integer age, Integer score) {
	
		this.age = age;
		this.score = score;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", score=" + score
				+ ", name=" + name + "]";
	}
	

	

}
