package main;
// Person class with first name, last name, and age
public class Person {
	String firstName;
	String lastName;
	int age;
// Constructor to create a person object	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
// Return a string of person	
	public String toString() {
		return lastName + ", " + firstName + " (Age: " + age + ")";
	}
}
