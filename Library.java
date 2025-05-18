package week2day2_homework;

public class Library {

	
	String addBook(String bookTitle)
	{

		return(bookTitle);
	}
	
	public void issueBook()
	{
		System.out.println("Book issued Successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library book1= new Library();
String bookname=book1.addBook("As you like it");
System.out.println(bookname);
book1.issueBook();

	}

}
