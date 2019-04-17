package suchi.lambda;

import java.util.Arrays;
import java.util.List;

public class GeneratePerson {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("John","Johnny",12),
				new Person("Jennifer","anitson",12),
				new Person("slvia","lopez",12),
				new Person("sandra","bullock",12),
				new Person("thomas","edison",12),
				new Person("mark","twain",51));
		
		//persons.parallelStream().forEach((p1,p2)->p1.firstName.compareTo());

	}

}
