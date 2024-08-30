package Javaprograms;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.ListIterator;

	public class ArrayListBehavior {
	    public static void main(String[] args) {
	        // Create an ArrayList of Strings
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Mango");

	        // Using Iterator to traverse the ArrayList
	        System.out.println("Using Iterator:");
	        Iterator<String> iterator = fruits.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Using ListIterator to traverse the ArrayList
	        System.out.println("\nUsing ListIterator:");
	        ListIterator<String> listIterator = fruits.listIterator();

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
