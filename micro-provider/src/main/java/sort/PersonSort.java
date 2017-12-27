package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSort {

	public static void main(String[] args) {

		// Before Java 8
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Don", "Bosco"));
		personList.add(new Person("Remi", "Martin"));
		personList.add(new Person("Alex", "Thomas"));

		System.out.println(personList);

		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareTo(p2.getFirstName());
			}

		});

		
		
		Collections.sort(personList, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		
		personList.forEach((person) -> System.out.println(person.getFirstName()));
		
		System.out.println(personList);
	}

}
