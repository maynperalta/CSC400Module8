package main;

import java.util.*;

public class Queue {
	private List<Person> people;
// Constructor to initialize empty queue	
	public Queue() {
		people = new ArrayList<>();
	}
// Add person to queue	
	public void enqueue(Person person) {
		people.add(person);
	}
	public void displayQueue() {
		if (people.isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
// Display queue in table format		
		System.out.printf("%-3s %-15s %-15s %-5s%n", "#", "First Name", "Last Name", "Age");
		System.out.println("------------------------------------------");
		
		for (int i = 0; i < people.size(); i++) {
			Person e = people.get(i);
			System.out.printf("%-3d %-15s %-15s %-5d%n", i + 1, e.getFirstName(), e.getLastName(), e.getAge());
		}
	}
// Sort queue by last name in descending order	
	public void sortByLastName() {
		quickSort(0, people.size() - 1, (a, b) -> b.getLastName().compareTo(a.getLastName()));
	}
// Sort queue by age in descending order	
	public void sortByAge() {
		quickSort(0, people.size() - 1, (a, b) -> Integer.compare(b.getAge(), a.getAge()));
	}
// Use comparator for quickSort 	
	private void quickSort(int low, int high, Comparator<Person> comp) {
		if (low < high) {
			int pivot = partition(low, high, comp);
			quickSort(low, pivot - 1, comp);
			quickSort(pivot + 1, high, comp);
		}
	}
// Partition method for quickSort	
	private int partition(int low, int high, Comparator<Person> comp) {
		Person pivot = people.get(high);
		int i = low - 1;
		
		for (int j = low; j < high; j++) {
			if (comp.compare(people.get(j), pivot) <= 0) {
				i++;
				swap(i, j);
			}
		}
		swap(i + 1, high);
		return i + 1;
	}
// Swap elements in list.	
	private void swap(int i, int j) {
		Person temp = people.get(i);
		people.set(i, people.get(j));
		people.set(j, temp);
	}
}
