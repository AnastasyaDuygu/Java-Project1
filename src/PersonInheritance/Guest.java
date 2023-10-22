package PersonInheritance;

import java.util.Scanner;

import BookInheritance.Hardcopy;

public class Guest extends Borrower {
	
	public Guest() {
		
		super();
	}

	public Guest(String nameSurname, int personId, String phoneNo, String email, Hardcopy ownedBook) {
		super(nameSurname, personId, phoneNo, email, ownedBook);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nGuest\n" + super.toString();
	}
	
	public double calculateFee() {
		double fee = 0;
		demeritP = 4;
		fee = ownedBook.getBookPrice() * demeritP;
		return fee;
	}

	@Override
	public int demeritPoint() {
		return 4;
	}
}
