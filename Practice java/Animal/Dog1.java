package Animal;
public class Dog1 extends Animal1{
	
	private float weight;
	
	public Dog1(String name, int age, String gender, String color, float weight) {
		super(name, age, gender, color);
		this.weight = weight;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public static void main(String[] args) {		
		Dog1 dog = new Dog1("Golden", 1, "Male", "Gold", 20);
		System.out.println("Thuoc tinh cua Dog:");
		System.out.println("\tName: " + dog.getName());
		System.out.println("\tAge: " + dog.getAge());
		System.out.println("\tGender: " + dog.getGender());
		System.out.println("\tColor: " + dog.getColor());
		System.out.println("\tWeight: "+ dog.getWeight());

}
	
}