package FoodManagement;

import java.util.Scanner;

public class HangSanhSu extends ThongTinHang{
	private String nsx;
	private int nhk;
	public String getNsx() {
		return nsx;
	}
	public void setNsx(String nsx) {
		this.nsx = nsx;
	}
	public int getNhk() {
		return nhk;
	}
	public void setNhk(int nhk) {
		this.nhk = nhk;
	}
	 
	public void addInforCeramic() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao nha san xuat: ");
		nsx= sc.nextLine();
		System.out.println("Nhap vao thoi gian nhap kho: ");
		nhk= sc.nextInt();
	}

}
