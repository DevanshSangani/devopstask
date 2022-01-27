package basic.classes;

public class Employee {
	
	private int id;
	public String name;
	Gender gender;
	protected int age;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, Gender gender, int age) {
		super();
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.age=age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
