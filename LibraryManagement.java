package week2day2_homework;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library L1= new Library();
		String Book2=L1.addBook("You Can Win");
		System.out.println(Book2);
		L1.issueBook();
	}

}
