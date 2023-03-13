package SchoolManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class Lop extends Hocsinh {
	protected String classid;
	private ArrayList<Hocsinh> listHS = new ArrayList<>(); // Khai bao Array List
	private String choice;

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

//	public void ThemmoiHS() {
//		listHS.add(themMoiHS());
//	}

//	public void addList() {
//		Hocsinh hs1 = new Hocsinh();
//		listHS.add(hs1);
//		for (Hocsinh i : listHS) {
//			System.out.println(i + "");
//		}
//	}

	public void addMore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wanna add more Student ? Y/N");
		choice = sc.nextLine();
		switch (choice) {
		case "Y":
			Hocsinh hs2 = new Hocsinh();
			hs2.themMoiHS();
//			listHS.add(themMoiHS());
			break;
		case "N":
			System.out.println("Number of students in class:" + listHS.size());
			break;
		}
	}

	public void displayall() {
		System.out.println("All student infor ");
		for (int i = 0; i< listHS.size(); i++) {
		System.out.println(listHS.get(i));
	}
	}
}
