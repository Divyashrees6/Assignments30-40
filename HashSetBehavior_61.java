package Javaprograms;
import java.util.HashSet;
import java.util.Iterator;

		public class HashSetBehavior_61 {
		    public static void main(String[] args) {
		        // Create a HashSet of Strings
		        HashSet<String> fruits = new HashSet<>();
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Orange");
		        fruits.add("Mango");

		        // Using Iterator to traverse the HashSet
		        System.out.println("Using Iterator:");
		        Iterator<String> iterator = fruits.iterator();
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }
		        // ListIterator<String> listIterator = fruits.listIterator(); // This will cause a compile-time error


		        // Attempting to use ListIterator will cause an error
		        // Above code is commented out because HashSet doesn't support ListIterator
	}

}
