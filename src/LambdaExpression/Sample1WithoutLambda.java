package LambdaExpression;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample1WithoutLambda 
{

	public static void main(String[] args) {
		
		List<Person1> people = Arrays.asList(
				new Person1("Shinu", 4, "Automation"),
				new Person1("Ravi", 5, "Developer"),
				new Person1("Swathi", 8, "DataEngineer"),
				new Person1("Verma", 7, "Devops"),
				new Person1("Mithali", 1, "Developer"),
				new Person1("Sarath", 2, "Tester"),
				new Person1("Saranya", 2, "Developer"),
				new Person1("Vijay", 9, "Lead"));
		
		Collections.sort(people, new Comparator<Person1>() {

			@Override
			public int compare(Person1 p1, Person1 p2) {				
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		printAll(people);
		System.out.println("=======================================================");
		
		getSpecificPerson(people);
	}

	private static void getSpecificPerson(List<Person1> people) 
	{
		for(Person1 p : people)
		{
			if(p.getName().toUpperCase().startsWith("S"))
			{
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person1> people) 
	{
		for(Person1 p : people)
		{
			System.out.println(p);
		}
		
	}
	
	//Sort list by experience
	//Create method to print all element in the list
	//Create method to print people that have last name starting with S
}

class Person
{
	private String name;
	private int exp;
	private String role;
	
	public Person(String name, int exp, String role)
	{
		super();
		this.name= name;
		this.exp= exp;
		this.role= role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", exp=" + exp + ", role=" + role + "]";
	}
}