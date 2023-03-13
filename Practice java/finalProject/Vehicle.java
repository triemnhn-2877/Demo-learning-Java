package finalProject;

import java.util.Scanner;

public class Vehicle {

	protected int idnumber;
	protected String nsx;
	protected int releaseYear;
	protected String color;
	protected String ownername;
	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}

	public String getNsx() {
		return nsx;
	}

	public void setNsx(String nsx) {
		this.nsx = nsx;
	}

	public int getReleaseyear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String[] list = { "Honda", "Toyota", "Yamaha", "Suzuki" };
	
	public void addPname() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input Producer name: ");
		nsx= sc.nextLine();
		for (String str: list)
		if (nsx.equals(list)){
		return;
		}
		else
		{
			System.out.println("Data invalid, input name again: ");
			nsx= sc.nextLine();
		}
	}
	
	public void addRelease() {
		Scanner sc= new Scanner(System.in);
		releaseYear= Integer.parseInt(sc.nextLine());
		if (releaseYear> 2023 || releaseYear < 2000) {
		System.out.println("Data invalid, input year again");
		releaseYear= Integer.parseInt(sc.nextLine());
		}
		else {
			return;
		}
	}
	
	public void addId() {
		Scanner sc= new Scanner(System.in);
		for(idnumber =1 ; ;idnumber ++);
	}
	
	public void addOtherInfor() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input color: ");
		this.setColor(sc.nextLine());
		System.out.println("Input Owner name: ");
		this.setOwnername(sc.nextLine());
		return;
	}

//	public void addVehicle() {
//		Scanner sc = new Scanner(System.in);
//		do {
//		System.out.println("Input Producer name: ");
//		nsx = sc.nextLine();}
//		for (String str : list) {
//			while (nsx.equals(list)) {
//				System.out.println("Input release year: ");
//				releaseYear = Integer.parseInt(sc.nextLine());
//			}  
//		}
//			if (releaseYear > 2023 || releaseYear < 2000) {
//				System.out.println("Input color: ");
//				color = sc.nextLine();
//			} else {
//				System.out.println("Data invalid, again: ");
//				releaseYear = Integer.parseInt(sc.nextLine());
//			}
//			System.out.println("Input ownername: ");
//			this.setOwnername(sc.nextLine());
//			System.out.println("Input id: ");
//			idnumber = sc.nextInt();
//		}
	}
