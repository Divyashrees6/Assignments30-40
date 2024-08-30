package Javaprograms;

public class encaps_string56 {
	    private String name;

	    // Public getter method for name
	    public String getName() {
	        return name;
	    }

	    // Public setter method for name
	    public void setName(String name) {
	        this.name = name;
	    }
	

	    public static void main(String[] args) {
	        // Create a Person object
	    	encaps_string56 person = new encaps_string56();

	        // Set the name using the setter method
	        person.setName("Divya");

	        // Get the name using the getter method
	        System.out.println("Name: " + person.getName());  
	    }
	}

