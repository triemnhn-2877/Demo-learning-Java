import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lop extends Hocsinh{
	private List<Hocsinh> listHS = new ArrayList<>(); //Khai bao Array List
	private int count= listHS.size();
	private String choice;
	public void themMoiHS(Hocsinh hs) {
		listHS.add(hs);
	}
	public void addList() {
		Hocsinh hs1 = new Hocsinh();
		listHS.add(hs1);
		for (Hocsinh i: listHS) {
			System.out.println(i + "");
		}

	}
	public void addMore() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Wanna add Student ? Y/N");
		choice= sc.nextLine();
		switch (choice) {
		case "Y":
		Hocsinh hs2 = new Hocsinh();
		hs2.themMoiHS();
		break;
		case "N":
			System.out.println("Number of students in class:" + count);
		break;
		}
	}
	
	public static void main(String[] args) {
		Lop add = new Lop();
		add.addList();
		add.addMore();
	}

}
