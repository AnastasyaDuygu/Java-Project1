package PersonInheritance;


import java.util.ArrayList;
import java.util.Scanner;

import BookInheritance.*;
import PersonInterface.PersonInterface;

public abstract class  Borrower extends Person implements PersonInterface{
	
	protected String borrowDate;
	protected static int numOfPeople = 0;
	protected static int demeritP;
	protected Hardcopy ownedBook;

	
	public Borrower() {
		super();
		numOfPeople++;
	}
	
	public Borrower(String nameSurname, int personId, String phoneNo, String email, Hardcopy ownedBook) {
		super(nameSurname, personId, phoneNo, email);
		this.borrowDate = borrowDate;
		this.demeritP = demeritP;
		this.ownedBook = ownedBook;
		// TODO Auto-generated constructor stub
	}

	/*public static void addBook(Hardcopy hc) {
		ownedBook = hc;
	}*/

	
	public Hardcopy getOwnedBook() {
		return ownedBook;
	}

	public void setOwnedBook(Hardcopy ownedBook) {
		this.ownedBook = ownedBook;
	}

	public String toStringWithBook() {
		String book ="\nBorrowed Book Info:\n";
		if(getOwnedBook() == null) {
			book += "none";
		}else {
		book += getOwnedBook().toString();
		}
		return "Borrower"+ super.toString()
				+"\nBorrow Date = "+borrowDate+ book + "\n";
	}
	
	public String toString() { //without book
		return "Borrower"+ super.toString()
				+"\nBorrow Date = "+borrowDate+ "\n";
	}
	
	public abstract double calculateFee();
}
