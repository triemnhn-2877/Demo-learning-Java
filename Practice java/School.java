import java.util.ArrayList;
import java.util.Scanner;

public class School extends Hocsinh { //extend hs là sai r, phải extend class mới đúng

	public void themhs() {
		ArrayList<String> themhs = new ArrayList<String>();
		System.out.println("Nhap ten:" );
		themhs.add(name);
		Scanner sc= new Scanner(System.in);
		name= sc.nextLine();
		System.out.println("Nhap tuoi:" );
		themhs.add(age);
		age= sc.nextLine();
		System.out.println("Nhap dia chi:" );
		themhs.add(address);
		address= sc.nextLine();
	}
	/*
	 * public void ThemHs() { Scanner sc = new Scanner(System.in);
	 * System.out.println("Nhap tên hoc sinh: "); name = sc.nextLine();
	 * System.out.println("Nhap tuoi: "); age = Integer.parseInt(sc.nextLine());
	 * System.out.println("Nhap que quan: "); address = sc.nextLine(); }
	 */

	public static void main(String[] args) {
		School hs1 = new School(); hs1.themhs();
	}

}
