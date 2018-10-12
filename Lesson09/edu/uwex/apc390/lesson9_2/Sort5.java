package edu.uwex.apc390.lesson9_2;

/**
 * @author Anthony Varghese
 * Refactored version of Sort4
 *  - use the PersonList container class
 *  - Use bubbleSort
 */
public class Sort5 {
	private static final int LISTSIZE = 10;
	/**
	 * main
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// set up a list filled with people
		final PersonList pList = new PersonList( LISTSIZE );
		add(pList);

		System.out.println(" Starting list:\n   " + pList );
		
		pList.bubbleSort();
		System.out.println(" List in sorted order using Bubble sort:\n   " + pList);
	}
	
	// Add things to the list
	private static void add(PersonList pList) {
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