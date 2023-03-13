package FoodManagement;
import java.util.Scanner;

public class HangThucPham extends ThongTinHang {
	private int day;
	private int month;
	private int year;
	
	public int getday() {
		return day;
	}
	public void setday(int day) {
		this.day= day;
	}
	
	public int getmonth() {
		return month;
	}
	public void setmonth(int month) {
		this.month= month;
	}
	
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		this.year= year;
	}
	
	void inputyear() {
		System.out.println("Nhap vao nam");
		Scanner sc= new Scanner(System.in);
		year= sc.nextInt();
		if (year <= 0) {
			System.out.println("Nam khong hop le, nhap lai: ");
			year= sc.nextInt();
		}
		return;
	}
	void inputmonth() {
		System.out.println("Nhap vao thang: ");
		Scanner sc= new Scanner(System.in);
		month= sc.nextInt();
		if (month > 12 && month < 1) {
			System.out.println("Thang khong hop le, nhap lai: ");
			month= sc.nextInt();
			return;
		}
	}
	
	void inputday() {
		System.out.println("Nhap vao ngay: ");
		Scanner sc= new Scanner(System.in);
		day= sc.nextInt();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
