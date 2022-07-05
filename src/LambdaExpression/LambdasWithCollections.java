package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdasWithCollections {

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
		
		System.out.println(people);
		people.forEach(System.out::println);
	}
	
}
