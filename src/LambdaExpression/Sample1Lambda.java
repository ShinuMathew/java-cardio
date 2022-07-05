package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Sample1Lambda 
{
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Shinu", 4, "Automation"),
				new Person("Ravi", 5, "Developer"),
				new Person("Swathi", 8, "DataEngineer"),
				new Person("Verma", 7, "Devops"),
				new Person("Mithali", 1, "Developer"),
				new Person("Sarath", 2, "Tester"),
				new Person("Saranya", 2, "Developer"),
				new Person("Vijay", 9, "Lead"));
		
		Collections.sort(people, (p1, p2)-> p1.getName().compareTo(p2.getName()));	
		//Comparator is the functional interface. We just need to pass on the implementation of the method in it as Comparator already has a method compareTo()
		
		performDesiredActions(people, p->p.getRole().equals("Developer"), p->System.out.println(p));
		
		performDesiredActions(people, p->p.getRole().equals("Tester"), System.out::println);
	}

	private static void performDesiredActions(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer)
	{
		for(Person person : people)
		{
			if(predicate.test(person))
			{
				consumer.accept(person);
			}
		}
	}
}

class Person1
{
	private String name;
	private int exp;
	private String role;
	
	public Person1(String name, int exp, String role)
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