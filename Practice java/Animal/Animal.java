package Animal;

public class Animal {
	
	protected static String name;
	protected static int age;
	protected static String type;
	
	public Animal(String name, String type, int age) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type= type;
	}
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age= age;
	}
	
}
