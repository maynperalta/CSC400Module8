package main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Queue queue = new Queue();
		final int NUM_PEOPLE = 5;
		
		System.out.println("Enter name and age information for 5 people: ");
		
		for(int i = 0; i < NUM_PEOPLE; ++i) {
			System.out.println("\nPerson " + (i + 1));
			
			String first;
			while (true) {
				System.out.print("First Name: ");
				first = scnr.nextLine().trim();
				if(!first.isEmpty()) {
					break;
				}
				System.out.println("First name cannot be blank.");
			}
			
			String last;
			while (true ) {
				System.out.print("Last Name: ");
				last = scnr.nextLine().trim();
				if(!last.isEmpty()) {
					break;
				}
				System.out.println("Last name cannot be blank.");
			}
			
			int age = -1;
			while(true) {
				System.out.print("Age: ");
			
				if (scnr.hasNextInt()) {
					age = scnr.nextInt();
					scnr.nextLine();
					if (age > 0 && age <= 120) {
						break;
					} else {
						System.out.println("Age must be between 1 and 120.");
					}
				} else {
					System.out.println("Invalid input. Please enter an integer.");
					scnr.nextLine();
				}
			}
			
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
