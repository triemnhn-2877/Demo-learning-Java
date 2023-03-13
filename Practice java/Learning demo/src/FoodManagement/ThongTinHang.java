package FoodManagement;
import java.util.Scanner;

public class ThongTinHang {
	protected String id;
	protected String name; 
	protected int price;
	protected int remain;
	private String vat;
	
	
	public String getVat() {
		return vat;
	}
	public void setVat(String vat) {
		this.vat = vat;
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id= id;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name= name;
	}
	
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price= price;
	}
	
	public int getremain() {
		return remain;
	}
	
	public void setremain(int remain) {
	this.remain= remain;	
	}
	
	public void inputid() {
		System.out.println("Nhap id: ");
		Scanner sc = new Scanner(System.in);
		id = sc.nextLine();
		return;
	}
	
	public void inputname() {
		System.out.println("Nhap ten hang:");
		Scanner sc = new Scanner(System.in);
		name= sc.nextLine();
		return;
	}
	
	public void inputprice() {
		System.out.println("Nhap gia: ");
		Scanner sc= new Scanner(System.in);
		price= sc.nextInt();
		return;
	}
	
	public void inputremain() {
		System.out.println("Nhap so luong hang con trong kho: ");
		Scanner sc= new Scanner(System.in);
		remain= sc.nextInt();
		if (remain < 0) {
			System.out.println("So luong phai duong, vui long nhap lai: ");
			remain= sc.nextInt();
		}
	}
	public void addInfor() {
		ThongTinHang infor= new ThongTinHang();
		infor.inputid();
		infor.inputname();
		infor.inputprice();
		infor.inputremain();	
	}
	
	public static void main(String[] args) {
		ThongTinHang x1 = new ThongTinHang();
		x1.addInfor();
	}

}
