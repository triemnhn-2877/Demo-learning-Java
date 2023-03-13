package finalProject;
import java.util.Scanner;

import FoodManagement.Thue;

public  class Xemay implements Thue {
	private float price;

	public float getprice() {
		return price;
	}

	public void setprice(float price) {
		this.price = price;
	}

	public float tinhVAT() {
		return (price / 100 * 10);
	}

	public float tinhTTB() {
		return (price / 100 * 5);
	}
	
	@Override
	public float Thue() {
		return (price - tinhVAT()- tinhTTB());
	}
	
	public void input() {
		System.out.println("Nhap vao gia");
		Scanner sc = new Scanner(System.in);
		price = sc.nextFloat();
	}
	
	public void infor() {
		System.out.println("Thue VAT: " + tinhVAT());
		System.out.println("Thue TTB: " + tinhTTB());
		System.out.println("Tong gia sau thue: " + Thue());
	}

	public static void main(String[] args) {
		Xemay xemay1=new Xemay();
		xemay1.input();
		xemay1.infor();
	}

}
