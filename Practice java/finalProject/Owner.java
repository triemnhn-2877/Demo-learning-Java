package finalProject;

import java.util.Scanner;

public interface Owner {
	public static void setData(String identifierNumber, String name, String emailAddress) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input name: ");
		name= sc.nextLine();
		System.out.println("Input Identifier Number: ");
		identifierNumber= sc.nextLine();
		System.out.println("Input email address: ");
		emailAddress= sc.nextLine();
	}
	 
	
	public default void searchByOwnerID(String identifierNumber) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input ID of Owner: ");
		identifierNumber=sc.nextLine();
	}
	
}
