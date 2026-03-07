package main;

import java.util.*;

public class Queue {
	private List<Person> people;
	
	public Queue() {
		people = new ArrayList<>();
	}
	
	public void enqueue(Person person) {
		people.add(person);
	}
	public void displayQueue() {
		for(Person e : people) {
			System.out.println(e);
		}
	}
	
	public void sortByLastName() {
		quickSort(0, people.size() - 1, (a, b) -> b.lastName.compareTo(a.lastName));
	}
	
	public void sortByAge() {
		quickSort(0, people.size() - 1, (a, b) -> b.age - a.age);
	}
	
	private void quickSort(int low, int high, Comparator<Person> comp) {
		if (low < high) {
			int pivot = partition(low, high, comp);
			quickSort(low, pivot - 1, comp);
			quickSort(pivot + 1, high, comp);
		}
	}
	
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
	private void swap(int i, int j) {
		Person temp = people.get(i);
		people.set(i, people.get(j));
		people.set(j, temp);
	}
}
