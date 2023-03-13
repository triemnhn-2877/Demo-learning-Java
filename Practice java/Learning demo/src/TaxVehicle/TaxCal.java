package TaxVehicle;

import java.util.Scanner;

public class TaxCal implements TinhThue {
	private int income;
	private int select;
	private double truckTax1;
	private double coachTax1;
	private double truckTax2;
	private double coachTax2;

	public double getTruckTax2() {
		return truckTax2;
	}

	public void setTruckTax2(double truckTax2) {
		this.truckTax2 = truckTax2;
	}

	public double getCoachTax2() {
		return coachTax2;
	}

	public void setCoachTax2(double coachTax2) {
		this.coachTax2 = coachTax2;
	}

	public int getSelect() {
		return select;
	}

	public void setSelect(int select) {
		this.select = select;
	}

	public double getTruckTax1() {
		return truckTax1;
	}

	public void setTruckTax1(double truckTax1) {
		this.truckTax1 = truckTax1;
	}

	public double getCoachTax1() {
		return coachTax1;
	}

	public void setCoachTax1(double coachTax1) {
		this.coachTax1 = coachTax1;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public void inputData() {
		System.out.println("Nhap thu nhap: ");
		Scanner sc= new Scanner(System.in);
		income= Integer.parseInt(sc.nextLine());
		System.out.println("Chon loai xe can tinh thue: ");
		System.out.println("1: Xe dap");
		System.out.println("2: Xe ban tai");
		System.out.println("3: Xe khach");
		select= sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("Xe dap k can tra thue");
			break;
		case 2:
			int VAT=10;
			int TTB = 5;
			truckTax1= income/100*VAT;
			truckTax2=income/100*TTB;
			System.out.println("Thue VAT xe ban tai: " + truckTax1);
			System.out.println("Thue TTB xe ban tai: " + truckTax2);
			break;
		case 3:
			int VAT1=10;
			int TTB1=2;
			truckTax1= income/100*VAT1;
			truckTax2=income/100*TTB1;
			System.out.println("Thue VAT xe khach: " + truckTax1);
			System.out.println("Thue TTB xe khach: " + truckTax2);
			break;
		default:
			System.out.println("Data invalid" );
		}
	}

	public static void main(String[] args) {
		TaxCal t1= new TaxCal();
		t1.inputData();
	}

}
