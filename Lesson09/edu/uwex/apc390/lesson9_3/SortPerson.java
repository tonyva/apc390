package edu.uwex.apc390.lesson9_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.uwex.apc390.lesson9_2.PersonComparable;

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
		final List<PersonComparable> pList = new ArrayList<>();
		add(pList);

		System.out.println(" Starting list:\n   " + pList );
		
		Collections.sort( pList );;
		System.out.println(" List in sorted order using Collections sort:\n   " + pList);
	}
	
	// Add things to the list
	private static void add(List<PersonComparable> pList) {
		pList.add(new PersonComparable("Fred","Fox Valley"));
		pList.add(new PersonComparable("Anna","Appleton"));
		pList.add(new PersonComparable("Beth","Bayfield"));
		pList.add(new PersonComparable("Hannah","Harmony"));
		pList.add(new PersonComparable("Leila","Laona"));
		pList.add(new PersonComparable("Ahmad","Alma"));
		pList.add(new PersonComparable("Jacob","Janesville"));
		pList.add(new PersonComparable("Ruxin","Richmond"));
		pList.add(new PersonComparable("Wendy","Waukesha"));
		pList.add(new PersonComparable("Fred","Jordan"));
	}
}