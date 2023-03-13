package Animal;
public class Dog extends Animal {
	private static String color;
	private static float weight;
	
	public Dog (String name, String type, int age, String color, float weight) {
		super(name, type,age);
		this.color = color;
		this.weight= weight;
	}
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color= color;
	}
	
	public float getweight() {
		return weight;
	}
	public void setweight(float weight) {
		this.weight= weight;
	}
	
	
	
	public void display_infor() {
		System.out.println("Information of Animal");
		System.out.println("Name: " + name);
		System.out.println("Age: "+ age);
		System.out.println("Type: "+ type);
		System.out.println("Color: "+ color);
		System.out.println("Weight: "+ weight);
	}
	
	public static void main(String[] args) {
		Dog a = new Dog("aa", "aa", 0, "aaa", 1);
		Dog dog_1 = new Dog(name, color, age, type, weight);
		dog_1.setage(1);
		dog_1.setcolor("Trang");
		dog_1.setname("Harry");
		dog_1.settype("Bitbull");
		dog_1.setweight(15);
		dog_1.display_infor();

	}

}
