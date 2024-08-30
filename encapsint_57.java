package Javaprograms;
public class encapsint_57 {
	    // Private variable - encapsulated data
	    private int rollNumber;

	    // Public getter method for rollNumber
	    public int getRollNumber() {
	        return rollNumber;
	    }

	    // Public setter method for rollNumber
	    public void setRollNumber(int rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    public static void main(String[] args) {
	        // Create a Student object
	    	encapsint_57 student = new encapsint_57();

	        // Set the roll number using the setter method
	        student.setRollNumber(101);

	        // Get the roll number using the getter method
	        System.out.println("Roll Number: " + student.getRollNumber());  // Output: Roll Number: 101
	    }

}
