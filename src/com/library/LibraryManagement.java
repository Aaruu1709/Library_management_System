package com.library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Book> books = new ArrayList<>();

		while (true) {

			System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");

			System.out.println("1. Add Book");
			System.out.println("2. View Books");
			System.out.println("3. Search Book");
			System.out.println("4. Issue Book");
			System.out.println("5. Return Book");
			System.out.println("6. Delete Book");
			System.out.println("7. Exit");

			System.out.print("Enter Choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			// ADD BOOK
			case 1:

				System.out.print("Enter Book ID: ");
				int id = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Book Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Author Name: ");
				String author = sc.nextLine();

				Book b = new Book(id, name, author);

				books.add(b);

				System.out.println("Book Added Successfully!");

				break;

			// VIEW BOOKS
			case 2:

				if (books.isEmpty()) {

					System.out.println("No Books Available!");

				} else {

					for (Book book : books) {

						book.display();
					}
				}

				break;

			// SEARCH BOOK
			case 3:

				System.out.print("Enter Book ID: ");

				int searchId = sc.nextInt();

				boolean found = false;

				for (Book book : books) {

					if (book.id == searchId) {

						book.display();

						found = true;

						break;
					}
				}

				if (!found) {

					System.out.println("Book Not Found!");
				}

				break;

			// ISSUE BOOK
			case 4:

				System.out.print("Enter Book ID to Issue: ");

				int issueId = sc.nextInt();

				boolean issued = false;

				for (Book book : books) {

					if (book.id == issueId) {

						if (!book.issued) {

							book.issued = true;

							System.out.println("Book Issued Successfully!");

						} else {

							System.out.println("Book Already Issued!");
						}

						issued = true;

						break;
					}
				}

				if (!issued) {

					System.out.println("Book Not Found!");
				}

				break;

			// RETURN BOOK
			case 5:

				System.out.print("Enter Book ID to Return: ");

				int returnId = sc.nextInt();

				boolean returned = false;

				for (Book book : books) {

					if (book.id == returnId) {

						if (book.issued) {

							book.issued = false;

							System.out.println("Book Returned Successfully!");

						} else {

							System.out.println("Book is Already Available!");
						}

						returned = true;

						break;
					}
				}

				if (!returned) {

					System.out.println("Book Not Found!");
				}

				break;

			// DELETE BOOK
			case 6:

				System.out.print("Enter Book ID to Delete: ");

				int deleteId = sc.nextInt();

				boolean deleted = false;

				for (Book book : books) {

					if (book.id == deleteId) {

						books.remove(book);

						deleted = true;

						System.out.println("Book Deleted Successfully!");

						break;
					}
				}

				if (!deleted) {

					System.out.println("Book Not Found!");
				}

				break;

			// EXIT
			case 7:

				System.out.println("Thank You!");

				System.exit(0);

			default:

				System.out.println("Invalid Choice!");
			}
		}
	}
}