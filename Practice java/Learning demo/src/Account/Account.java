package Account;
import java.util.Scanner;

public class Account {
	private String id;
	private String name;
	private int balance;
	private static int trans;

	public int getTrans() {
		return trans;
	}

	public void setTrans(int trans) {
		this.trans = trans;
	}

	public Account(String id, String name, int balance) {
		this.balance = balance;
		this.id = id;
		this.name = name;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getbalance() {
		return balance;
	}

	public void setbalance(int balance) {
		this.balance = balance;
	}

	public void creadit(int amount) {
		if (amount > 0) {
			return;
		}
		this.balance = this.balance + amount;
	}

	public void debit(int amount) {
		if (amount > balance) {
			System.out.println("Thanh toan khong thanh cong");
			return;
		}
		if (balance > 0) {
			this.balance = balance - amount;
			return;
		}
		if (balance <= 0) {
			System.out.println("Invalid param");
		}
	}

	public void transferTo(Account account, int amount) {
		this.balance = this.balance - amount;
		account.balance = account.balance + amount;
	}

	public static void main(String[] args) {
//		Account a =new Account("01","Triem",100);
//		a.creadit(10);
//		System.out.println("So tien duoc chuyen" + a.balance);
//		
//		Account b= new Account("02","Tr",10);
//		b.debit(100);
//		System.out.println("So tien nhan"+ b.balance);
//		
//		
		Account a = new Account("01", "Triem", 200);
		Account b = new Account("02", "Thinh", 100);
		System.out.println("Nhap so tien chuyen: ");
		Scanner sc = new Scanner(System.in);
		trans = sc.nextInt();
		if (a.balance > trans || a.balance == trans) {
			System.out.println("Chuyen tien thanh cong, da chuyen di "+ trans);
			a.transferTo(b, trans);
			return;
		} else {
			System.out.println("Chuyen tien that bai ");
		}
	}

}
