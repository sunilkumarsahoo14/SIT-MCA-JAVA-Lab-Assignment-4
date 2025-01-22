/*
Develop a class to represent a Book with data members like title, author and price.
Create an array of 5 book object and initialize them with parameterized constructor.
Display the details of all the books.
*/

import java.util.Scanner;
class Books{
	String title;
	String author;
	float price;
	
	public Books(String title, String author, float price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void getDetails()
	{
		System.out.println("Book Title: "+this.title+"\nBook Author: "+ this.author+"\nBook Price: "+ this.price);
	}
}

class Book{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Total Number Of Books: ");
		int n = sc.nextInt();
		Books book[] = new Books[n];
		for(int i = 0; i < n; i++){
			
			System.out.println("Enter The Book Title:");
			String title = sc.nextLine();
			System.out.println("Enter The Book Author:");
			String author = sc.nextLine();
			System.out.println("Enter The Book Price: ");
			float price = sc.nextFloat();
			book[i] = new Books(title, author, price);
		}
		System.out.println("\n*******Book Details********");
		for(int i=0;i<n;i++)
		{
			System.out.println("\nBook - "+(i+1));
			book[i].getDetails();
		}
	}
}