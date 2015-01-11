package lab2.exercise1;

public class Book implements Comparable<Book>{
	private String title;
	private String isbn;
	private String author;

	public Book(String title, String isbn, String author) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return title;
	}

	@Override
	public int compareTo(Book b) {

		return this.title.compareTo(b.title);
	}

}