package finalProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QLXe implements Owner {
	private static int n;
	private static String search;
	private int searchID;

	public String getSearch() {
		return search;
	}

	public int getSearchID() {
		return searchID;
	}

	public void setSearchID(int searchID) {
		this.searchID = searchID;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	static List<Vehicle> danhSachXe = new ArrayList<>(n);

	public void searchVehicleID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input ID of Vehicle: ");
		this.setSearchID(sc.nextInt());
		for (Vehicle vehicle : danhSachXe) {
			if (danhSachXe.contains(sc)) {
				System.out.println(vehicle);
			}
		}
	}

	public static void main(String[] args) {
		Vehicle x2 = new Vehicle();
		System.out.println("Number vehicle wanna import: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x2.addPname();
		x2.addRelease();
		x2.addOtherInfor();
//		x2.addVehicle();
		danhSachXe.add(x2);
		while (danhSachXe.size() < n) {
			x2.addPname();
			x2.addRelease();
			x2.addId();
			x2.addOtherInfor();
			danhSachXe.add(x2);
		}
		// in ra danh sach xe
		System.out.println("List vehicle: ");
		for (Vehicle vs : danhSachXe) {
			System.out.println("Id: " + vs.getIdnumber());
			System.out.println("Color: " + vs.getColor());
			System.out.println("Producer: " + vs.getNsx());
			System.out.println("Release date: " + vs.getReleaseyear());
			System.out.println("Owner name: " + vs.getOwnername());
		}

//		System.out.println("Input id of vehicle wanna search: ");
//		search = sc.nextLine();
//		if (danhSachXe.contains(search)) {
//			System.out.println(danhSachXe);
//		}
//
//		QLXe x3 = new QLXe();
//		x3.searchVehicleID();
//
//		QLXe x4 = new QLXe();
//		x4.searchByOwnerID(sc.nextLine());
//		for (Vehicle vehicle : danhSachXe) {
//			if (danhSachXe.contains(sc)) {
//				System.out.println(vehicle);
//			}
		}

	}

//}