package Javaprograms;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Enumeration;

		public class VectorIterationExample {
		    public static void main(String[] args) {
		        // Create a Vector
		        Vector<String> vector = new Vector<>();
		        vector.add("A");
		        vector.add("B");
		        vector.add("C");

		        // Iterate using Iterator
		        System.out.println("Using Iterator:");
		        Iterator<String> iterator = vector.iterator();
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }

		        // Iterate using ListIterator
		        System.out.println("\nUsing ListIterator:");
		        ListIterator<String> listIterator = vector.listIterator();
		        while (listIterator.hasNext()) {
		            System.out.println(listIterator.next());
		        }

		        // Iterate using Enumeration
		        System.out.println("\nUsing Enumeration:");
		        Enumeration<String> enumeration = vector.elements();
		        while (enumeration.hasMoreElements()) {
		            System.out.println(enumeration.nextElement());
		        }
		    }
		}
