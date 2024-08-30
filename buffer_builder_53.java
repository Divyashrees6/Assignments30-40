package Javaprograms;
public class buffer_builder_53 {
	public static void main(String[] args) {
		   
		        StringBuilder sb = new StringBuilder("Divya");

		        sb.append(" Shree");
		        System.out.println("After append: " + sb);  

		        sb.insert(5, ",");
		        System.out.println("After insert: " + sb);  

		        sb.replace(5, 6, "!");
		        System.out.println("After replace: " + sb);  

		        sb.delete(5, 7);
		        System.out.println("After delete: " + sb);  

		        sb.deleteCharAt(5);
		        System.out.println("After deleteCharAt: " + sb);  

		        sb.reverse();
		        System.out.println("After reverse: " + sb);  

		        int length = sb.length();
		        System.out.println("Length: " + length);  

		        int capacity = sb.capacity();
		        System.out.println("Capacity: " + capacity);

		        sb.ensureCapacity(50);
		        System.out.println("Capacity after ensureCapacity: " + sb.capacity());

		        sb.setLength(5);
		        System.out.println("After setLength: " + sb); 

		        char ch = sb.charAt(2);
		        System.out.println("Character at index 2: " + ch); 

		        String sub = sb.substring(1, 3);
		        System.out.println("Substring from index 1 to 3: " + sub);  
		    }
		}

	
