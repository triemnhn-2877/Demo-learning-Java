package FoodManagement;

import java.util.Scanner;

public class HangDienMay extends ThongTinHang {
	private int tgbh;
	private String congsuat;
	
	

	public int getTgbh() {
		return tgbh;
	}



	public void setTgbh(int tgbh) {
		this.tgbh = tgbh;
	}



	public String getCongsuat() {
		return congsuat;
	}



	public void setCongsuat(String congsuat) {
		this.congsuat = congsuat;
	}
	
	public void addInforMachine() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao so thang bao hanh: ");
		tgbh= Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao cong suat: ");
		congsuat= sc.nextLine();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
