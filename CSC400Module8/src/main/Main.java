package main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Queue queue = new Queue();
		
		System.out.println("Enter name and age information for 5 people: ");
		
		for(int i = 0; i < 5; ++i) {
			System.out.println("\nPerson " + (i + 1));
			
			System.out.print("First Name: ");
			String first = scnr.nextLine();
			
			System.out.print("Last Name: ");
			String last = scnr.nextLine();
			
			System.out.print("Age: ");
			int age = scnr.nextInt();
			scnr.nextLine();
			
			queue.enqueue(new Person(first, last, age));
		}
		
		System.out.println("\nQueue: ");
		queue.displayQueue();
		
		queue.sortByLastName();
		System.out.println("\nSorted by Last Name (Descending): ");
		queue.displayQueue();
		
		queue.sortByAge();
		System.out.println("\nSorted by Age (Descending): ");
		queue.displayQueue();
		
		scnr.close();

	}

}
