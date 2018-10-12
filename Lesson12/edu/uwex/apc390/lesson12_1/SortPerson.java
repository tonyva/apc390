package edu.uwex.apc390.lesson12_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Anthony Varghese
 * Refactored version of Sort4
 *  - use the PersonList container class
 *  - Use bubbleSort
 */
public class SortPerson {
	/**
	 * main
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// set up a list filled with people
		final List<Person> pList = new ArrayList<>();
		add(pList);

		System.out.println(" Starting list:   " + pList );
		
		// Technique 1 ------------------------------------------------------
		// Set up a comparator object to compare two Person objects
		Comparator<Person> comparator = new Comparator<>() {
			@Override
			public int compare(Person o1, Person o2) {
				int nameCompare = o1.getName().compareTo(o2.getName());
				if (nameCompare == 0)
					return o1.getAddress().compareTo(o2.getAddress());
				return nameCompare;
			}			
		};
		Collections.sort( pList, comparator );
		// ------------------------------------------------------------------
		System.out.println(" Sorted using Comparator object:   " + pList);
		
		Collections.shuffle(pList);
		System.out.println("\n List shuffled:   " + pList);
		// Technique 2 ------------------------------------------------------
		Collections.sort( pList, (o1, o2) -> {
			int nameCompare = o1.getName().compareTo(o2.getName());
			return (nameCompare == 0) ? o1.getAddress().compareTo(o2.getAddress()) : nameCompare;
		} );
		// ------------------------------------------------------------------
		System.out.println(" Sorted using lambda:   " + pList);
		
		Collections.shuffle(pList);
		System.out.println("\n List shuffled again:   " + pList);
		// Technique 3 ------------------------------------------------------
		Collections.sort( pList, Comparator.comparing(Person::getName) );
		// ------------------------------------------------------------------
		System.out.println(" Sorted using Function:   " + pList);
		
	}
	
	// Add things to the list
	private static void add(List<Person> pList) {
		pList.add(new Person("Fred","Fox Valley"));
		pList.add(new Person("Anna","Appleton"));
		pList.add(new Person("Beth","Bayfield"));
		pList.add(new Person("Hannah","Harmony"));
		pList.add(new Person("Leila","Laona"));
		pList.add(new Person("Ahmad","Alma"));
		pList.add(new Person("Jacob","Janesville"));
		pList.add(new Person("Ruxin","Richmond"));
		pList.add(new Person("Wendy","Waukesha"));
		pList.add(new Person("Fred","Jordan"));
	}
}