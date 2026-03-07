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
		quickSort(0, people.size() - 1, "lastName");
	}
	
	public void sortByAge() {
		quickSort(0, people.size() - 1, "age");
	}
	
	private void quickSort(int low, int high, String key) {
		if (low < high) {
			int pivot = partition(low, high, key);
			quickSort(low, pivot - 1, key);
			quickSort(pivot + 1, high, key);
		}
	}
	
	private int partition(int low, int high, String key) {
		Person pivot = people.get(high);
		int i = low - 1;
		
		for (int j = low; j < high; ++j) {
			boolean condition;
			if (key.equals("lastName")) {
				condition = people.get(j).lastName.compareTo(pivot.lastName) >= 0;
			} else {
				condition = people.get(j).age >= pivot.age;
			}
			if (condition) {
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
