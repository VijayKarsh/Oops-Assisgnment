package EncapsulationandInheritance;

import java.security.PublicKey;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class BookDetails {

	public static void main(String[] args) {
		Book book = new Book();
		EngineeringBook engineeringBook= new EngineeringBook();
		Scanner sc =new Scanner(System.in);
	
		System.out.print("enter Book number : ");
		book.setBookNo(sc.nextInt());
		System.out.print("enter Book Title : ");
		book.setTitle(sc.nextLine()+ sc.nextLine());
	
		System.out.print("enter Auther Name : ");
		book.setAuthor(sc.nextLine()+ sc.nextLine());
		
		System.out.println("enter category : ");
		engineeringBook.setCategory(sc.nextLine()+sc.nextLine());
		
		System.out.print("enter  Book price : ");
		book.setPrice(sc.nextFloat());
		
		
		
		System.out.println("BookNo : "+ book.getBookNo());
		System.out.println("Title : "+book.getTitle());
		System.out.println("author : "+book.getAuthor());
		System.out.println("category : "+engineeringBook.getCategory());
		System.out.println("price : "+book.getPrice());
		}
		
		

	}


