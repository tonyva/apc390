package edu.uwex.apc390.lesson8_7;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Hashtable;

public class MainMap {

	public static void main(String[] args) {
		Map<Integer, Person> hmap   = new HashMap<>();
		Map<Integer, Person> tmap   = new TreeMap<>();
		Map<Integer, Person> lhmap  = new LinkedHashMap<>();
		Map<Integer, Person> htable = new Hashtable<>();
		
		addRemoveMapEntries( hmap );
		System.out.println("\n---------------------------------------");
		addRemoveMapEntries( tmap );
		System.out.println("\n---------------------------------------");
		addRemoveMapEntries( lhmap );
		System.out.println("\n---------------------------------------");
		addRemoveMapEntries( htable );
	}

	private static void addRemoveMapEntries(Map<Integer, Person> map) {
		System.out.println( "Map using a " + map.getClass().getSimpleName() + ":");

		Person devi = new Person("Devi", "Platteville");
		Person dave = new Person("Dave", "Kenosha");
		Person diego = new Person("Diego", "Manitowoc");

		map.put(1, devi);
		map.put(5, dave);
		map.put(8, diego);
		System.out.println( "   " + map );

		System.out.println( "    The current list of keys are: " + map.keySet() );
		String status = "an existing";
		int key = 100;
		if (map.put(key, devi) == null)
			status  = "a new";
		System.out.println( "\n   Adding Devi with the key: " + key + " --> " + " as " + status + " pair.");
		System.out.println( "   Integer-Person map is now: " + map );
		System.out.println( "    The current list of keys are: " + map.keySet() );
		
		Person frances = new Person("Frances", "Luck");
		System.out.println( "\n   Replacing value with the key: " + key + " with " + frances);
		map.replace(key, frances);
		System.out.println( "   Integer-Person map is now: " + map );

		key = 8;
		System.out.println( "\n   Removed item at key: " + key +
				", which had the value: " + map.remove(key));
		System.out.println( "   Integer-Person map is now: " + map );
	}
}