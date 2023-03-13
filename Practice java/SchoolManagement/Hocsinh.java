package SchoolManagement;
import java.util.Scanner;

public class Hocsinh {
	protected String name;
	protected String address;
	protected String age;
	protected String i;

	public String getI() {
		return i;
	}

	public void setI(String i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public Hocsinh themMoiHS() {
		Hocsinh hs = new Hocsinh();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students wanna add ?");
		i = sc.nextLine();
		hs.setI(sc.nextLine());
		System.out.println("Starting add student");
		System.out.println("Input name: ");
		hs.setName(sc.nextLine());
		System.out.println("Input age: ");
		hs.setAge(sc.nextLine());
		System.out.println("Input Address: ");
		hs.setAddress(sc.nextLine());
		return hs;
	}

}
