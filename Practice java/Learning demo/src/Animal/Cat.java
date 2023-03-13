package Animal;
public class Cat extends Animal {	
	private static String HairColor;
	private static float height;
	
	public Cat (String HairColor, float height, String name, String type, int age) {
		super(name, type, age);
		this.HairColor = HairColor;
		this.height= height;
	}
	
	public String getHairColor() {
		return HairColor;
	}
	public void setHairColor(String HairColor) {
		this.HairColor= HairColor;
	}

	public float getheight() {
		return height;
	}
	public void setheight(float height) {
		this.height= height;
	}
	
	public void display_infor() {
		System.out.println("Information of Cat");
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Type: "+ type);
		System.out.println("Hair Color: "+ HairColor);
		System.out.println("Height: "+ height);
	}
	
	public static void main(String[] args) {
		Cat cat_1= new Cat(HairColor, height, HairColor, HairColor, age);
		cat_1.setage(2);
		cat_1.setHairColor("Yellow");
		cat_1.setheight(2);
		cat_1.settype("Arab");
		cat_1.setname("Mullan");
		cat_1.display_infor();
		
	}

}
