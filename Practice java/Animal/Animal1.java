package Animal;

public class Animal1 {
	protected String name;
	protected int age;
	protected String gender;
	protected String color;
	
	public Animal1(String name, int age, String gender, String color) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}


