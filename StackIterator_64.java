package Javaprograms;
import java.util.*;
	public class StackIterator_64 {
	    public static void main(String[] args) {
	        // Create a Stack and add some elements
	        Stack<String> stack = new Stack<>();
	        stack.push("Apple");
	        stack.push("Banana");
	        stack.push("Cherry");

	        // Display the Stack
	        System.out.println("Stack: " + stack);

	        // Check if Stack follows Iterator
	        System.out.println("\nUsing Iterator:");
	        Iterator<String> iterator = stack.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Check if Stack follows ListIterator
	        System.out.println("\nUsing ListIterator:");
	        ListIterator<String> listIterator = stack.listIterator();
	        while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }

	        // Demonstrate backward iteration using ListIterator
	        System.out.println("\nBackward iteration using ListIterator:");
	        while (listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	        }
	    }
	}
