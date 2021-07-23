package org.scanner;

import java.util.Scanner;

public class Studentdetails{

	public static void main(String[] args) {

		Scanner k=new Scanner(System.in);
		
		System.out.println("Enter the Student ID; ");
		int i = k.nextInt();
		System.out.println("Student ID ; "+i);
		
		System.out.println("Enter the Student EmailID; ");
		String j = k.next();
		System.out.println("Student EmailID ; "+j);
		
		System.out.println("Enter the Student Phno; ");
		int l = k.nextInt();
		System.out.println("Student Ph no ; "+l);
		
		System.out.println("Enter the Student Dept; ");
		String m = k.next();
		System.out.println("Student Ph no ; "+m);
		
		System.out.println("Enter the Student Gender; ");
		String n = k.next();
		System.out.println("Student Gender ; "+n);
		
		System.out.println("Enter the Student City; ");
		String o = k.next();
		System.out.println("Student Gender ; "+o);
		
	}

}
