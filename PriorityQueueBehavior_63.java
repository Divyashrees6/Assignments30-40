package Javaprograms;
import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueBehavior_63 {
    public static void main(String[] args) {
        // Create a PriorityQueue of Integers
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(20);
        numbers.add(15);
        numbers.add(30);
        numbers.add(10);

        // Using Iterator to traverse the PriorityQueue
        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Attempting to use ListIterator will cause an error
        // The following code is commented out because PriorityQueue doesn't support ListIterator
        // ListIterator<Integer> listIterator = numbers.listIterator(); // This will cause a compile-time error
    }
}

