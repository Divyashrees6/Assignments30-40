package Javaprograms;
	import java.util.LinkedList;
	import java.util.Iterator;
	import java.util.ListIterator;

	public class LinkedListBehavior {
	    public static void main(String[] args) {
	        // Create a LinkedList of Strings
	        LinkedList<String> cities = new LinkedList<>();
	        cities.add("Bangalore");
	        cities.add("Mysore");
	        cities.add("Mandya");
	        cities.add("Coorg");

	        // Using Iterator to traverse the LinkedList
	        System.out.println("Using Iterator:");
	        Iterator<String> iterator = cities.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Using ListIterator to traverse the LinkedList
	        System.out.println("\nUsing ListIterator:");
	        ListIterator<String> listIterator = cities.listIterator();

	        // Forward traversal
	        System.out.println("Forward Traversal:");
	        while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }

	        // Backward traversal
	        System.out.println("\nBackward Traversal:");
	        while (listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	        }
	}
}
