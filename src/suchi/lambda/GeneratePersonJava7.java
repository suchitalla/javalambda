package suchi.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeneratePersonJava7 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("John","Johnny",12),
				new Person("Jennifer","anitson",12),
				new Person("slvia","lopez",12),
				new Person("sandra","bullock",12),
				new Person("thomas","edison",12),
				new Person("mark","twain",51));
		
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {
				
				return arg0.getLastName().compareTo(arg1.getLastName());
			}
			
		});
		
		printAll(persons);
		
		printWithCondition(persons,new Condition() {
			
			public boolean test(String a)
			{
				return a.startsWith("C");
			}
		});
		
printWithCondition(persons,new Condition() {
			
			public boolean test(String a)
			{
				return a.startsWith("a");
			}
		});
		

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
interface Condition{
	
	boolean test(String a);
}
