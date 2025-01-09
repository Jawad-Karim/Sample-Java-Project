package oops.book_register;

import java.util.ArrayList;

public class Test_book_register {

	public static void main(String[] args) {

		Book book1 = new Book("java Programming ", "jawad karim", "9780131101630");
		Book book2 = new Book("Python Programming", "Ali Baba", "9355423489");		
		Book.add_Book(book1);
		Book.add_Book(book2);
		
		ArrayList < Book > bookCollection = Book.get_BookCollection();		
		System.out.println("List of books:");		
		for (Book book: bookCollection) {
			System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
		}		
		Book.remove_Book(book1);
		System.out.println("\nAfter removing " + book1.get_Title() + ":");		
		System.out.println("List of books:");
		for (Book book: bookCollection) {
			System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
		}
	}
}
