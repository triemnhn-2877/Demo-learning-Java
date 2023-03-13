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
		System.out.println("all student infor ");
		for(Hocsinh hs: listHS){
			System.out.println("Name: "+ hs.getName());
			System.out.println("Address: " +hs.getAddress() );
			System.out.println("Age: " + hs.getAge());
		}
	}
	
	public void findSt() {
		System.out.println("Hoc sinh 20 tuoi: ");
		for(Hocsinh st: listHS) {
			if (st.getAge()= 20) {
				System.out.println(listHS);
			}
		System.out.println("Hoc sinh 23 tuoi va que o DN: ");
		for( Hocsinh dn: listHS) {
			if ((dn.getAddress().equals(dn)) && (dn.getAge() = 23)) {
				
			}
		}
		
		}
	}
}
