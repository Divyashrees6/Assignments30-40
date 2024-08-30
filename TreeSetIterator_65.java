package Javaprograms;
import java.util.*;
	public class TreeSetIterator_65 {
	    public static void main(String[] args) {
	        // Create a TreeSet and add some elements
	        TreeSet<String> treeSet = new TreeSet<>();
	        treeSet.add("Apple");
	        treeSet.add("Banana");
	        treeSet.add("Cherry");
	        treeSet.add("Date");
	        
	        // Display the TreeSet
	        System.out.println("TreeSet: " + treeSet);

	        // Check if TreeSet follows Iterator
	        System.out.println("\nUsing Iterator:");
	        Iterator<String> iterator = treeSet.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Check if TreeSet follows ListIterator (it does not directly support ListIterator)
	        System.out.println("\nListIterator support check:");
	        try {
	            ListIterator<String> listIterator = (ListIterator<String>) treeSet.iterator();
	            // This cast will fail if TreeSet doesn't support ListIterator
	            while (listIterator.hasNext()) {
	                System.out.println(listIterator.next());
	            }
	            // Attempt backward iteration
	            while (listIterator.hasPrevious()) {
	                System.out.println(listIterator.previous());
	            }
	        } catch (ClassCastException e) {
	            System.out.println("TreeSet does not support ListIterator.");
	        }
	    }
	}
