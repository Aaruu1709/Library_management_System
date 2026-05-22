package com.library;

public class Book {

	int id;
	String name;
	String author;
	boolean issued;

	// Constructor
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.issued = false;
	}

	// Display Method
	public void display() {

		System.out.println("Book ID: " + id);
		System.out.println("Book Name: " + name);
		System.out.println("Author: " + author);

		if (issued) {
			System.out.println("Status: Issued");
		} else {
			System.out.println("Status: Available");
		}

		System.out.println("----------------------");
	}
}