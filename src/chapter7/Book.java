package chapter7;

public class Book {
	private String bookName;
	private String author;

	public Book() {

	}

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String gerBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAutohr(String author) {
		this.author = author;
	}

	public void showInfo() {
		System.out.println(bookName + " , " + author);
	}
}
