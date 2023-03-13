package FoodManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
	private int input;

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	List<ThongTinHang> manage= new ArrayList<>();
	
	public void addData() {
		ThongTinHang m1 = new ThongTinHang();
		System.out.println("Chon loai hang can nhap: ");
		System.out.println("1: Hang thuc pham");
		System.out.println("2: Hang dien may");
		System.out.println("3: Hang sanh su");
		Scanner sc= new Scanner(System.in);
		input= sc.nextInt();
		switch(input) {
		case 1: 
			((ThongTinHang) m1).addInfor();
			((HangThucPham) m1).addInforFood();
			break;
		case 2: 
			((ThongTinHang) m1).addInfor();
			((HangDienMay) m1).addInforMachine();
			break;
		case 3:
			((ThongTinHang) m1).addInfor();
			((HangSanhSu) m1).addInforCeramic();
			break;
		}
	}

	public static void main(String[] args) {
	
	}

}
