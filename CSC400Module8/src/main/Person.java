package main;
// Person class with first name, last name, and age
public class Person {
	private String firstName;
	private String lastName;
	private int age;
// Constructor to create a person object	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
// Setter and getter methods	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
// Return a string of person	
	@Override
	public String toString() {
		return lastName + ", " + firstName + " (Age: " + age + ")";
	}
}
