package Javaprograms;
	import java.util.Vector;
	import java.util.Iterator;
	import java.util.ListIterator;
	import java.util.Enumeration;

	public class VectorBehavior_62 {
	    public static void main(String[] args) {
	        // Create a Vector of Strings
	        Vector<String> animals = new Vector<>();
	        animals.add("Divya");
	        animals.add("Shree");
	        animals.add("Swathi");
	        animals.add("Vasu");

	        // Using Iterator to traverse the Vector
	        System.out.println("Using Iterator:");
	        Iterator<String> iterator = animals.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Using ListIterator to traverse the Vector
	        System.out.println("\nUsing ListIterator:");
	        ListIterator<String> listIterator = animals.listIterator();

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

	        // Using Enumeration to traverse the Vector
	        System.out.println("\nUsing Enumeration:");
	        Enumeration<String> enumeration = animals.elements();
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }
	    }
	}
