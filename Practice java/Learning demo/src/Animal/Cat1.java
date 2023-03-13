package Animal;
public class Cat1 extends Animal1{
	
	private float height;

	public Cat1(String name, int age, String gender, String color, float height) {
		super(name, age, gender, color);
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
	Cat1 cat = new Cat1("Meo Anh Long Ngan", 2, "Female", "White", 30);
	System.out.println("Thuoc tinh cua Cat:");
	System.out.println("\tName: " + cat.getName());
	System.out.println("\tAge: " + cat.getAge());
	System.out.println("\tGender: " + cat.getGender());
	System.out.println("\tColor: " + cat.getColor());
	System.out.println("\tWeight: "+ cat.getHeight());
}
	
	

}