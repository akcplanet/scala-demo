package org.test.cts.storage;

import java.util.ArrayList;

import org.test.cts.model.Book;

public class BookStorage {

	private ArrayList<Book> books = new ArrayList<Book>();

	public BookStorage() {
		books.add(new Book("White Fang", "Jack London"));
		books.add(new Book("The Sea-Wolf", "Jack London"));
		books.add(new Book("The Road", "Jack London"));
		books.add(new Book("The Adventures of Tom Sawyer", "Mark Twain"));
		books.add(new Book("Around the World in 80 Days", "Jules Verne"));
		books.add(new Book("Twenty Thousand Leagues Under the Sea", "Jules Verne"));
		books.add(new Book("The Mysterious Island", "Jules Verne"));
		books.add(new Book("The Four Million", "O. Henry"));
		books.add(new Book("The Last Leaf", "O. Henry"));
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

}
