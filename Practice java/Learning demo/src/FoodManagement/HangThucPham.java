package FoodManagement;
import java.util.Scanner;

public class HangThucPham extends ThongTinHang {
	private int nsx;
	private int nhh;
	private String ncc;
	
	public int getNsx() {
		return nsx;
	}

	public void setNsx(int nsx) {
		this.nsx = nsx;
	}

	public int getNhh() {
		return nhh;
	}

	public void setNhh(int nhh) {
		this.nhh = nhh;
	}

	public String getNcc() {
		return ncc;
	}

	public void setNcc(String ncc) {
		this.ncc = ncc;
	}
	
	public void addInforFood() {
		Scanner sc= new Scanner( System.in);
		System.out.println("Nhap vao ngay san xuat: ");
		nsx=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao ngay het han: ");
		nhh=Integer.parseInt(sc.nextLine());
		while (nsx >= nhh) {
			return;
		}
		System.out.println("Nhap vao nha cung cap: ");
		ncc= sc.nextLine();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
