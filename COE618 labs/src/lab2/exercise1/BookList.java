package lab2.exercise1;

import java.util.*;

public class BookList {
	private ArrayList<Book> books;

	public BookList() {
		books = new ArrayList<>();
	}

	public void addBook(String t, String i, String a) {
		books.add(new Book(t, i, a));
	}

	public String toString() {
		return books.toString();
	}

	public void sort() {
		Collections.sort(books);
	}

	public static void main(String[] args) {
		BookList bList = new BookList();
		// use the method addBook to add following books
		// to the list bList in the order as shown below.
		// title: “Calculus”, isbn: “1234”, author: “Goldstein”
		// title: “Java”, isbn: “5678”, author: “Gosling”
		// title: “Algorithms”, isbn: “4629”, author: “Cormen”
		bList.addBook("Calculus", "1234", "Goldstein");
		bList.addBook("Java", "5678", "Gosling");
		bList.addBook("Algorithms", "4629", "Cormen");
		bList.sort();
		System.out.println(bList);

	}
}
