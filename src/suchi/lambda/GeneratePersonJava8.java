package suchi.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeneratePersonJava8 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("John","Johnny",12),
				new Person("Jennifer","anitson",12),
				new Person("slvia","lopez",12),
				new Person("sandra","bullock",12),
				new Person("thomas","edison",12),
				new Person("mark","twain",51));
		
		Collections.sort(persons, (Person arg0, Person arg1) -> arg0.getLastName().compareTo(arg1.getLastName()));
	
		
		printAll(persons);
		
		printWithCondition(persons,(a)-> a. startsWith("b"));
			
		
printWithCondition(persons,(String a)->a.startsWith("a"));
			

	}
	
	private static void printWithCondition(List<Person> persons, Condition con) {
		
		for(Person per : persons)
		{
			if(con.test(per.getLastName()))
			System.out.println(per);
		}
	}

	public static void printAll(List<Person> p)
	{
		for(Person per : p)
		{
			System.out.println(per);
		}
	}
}
