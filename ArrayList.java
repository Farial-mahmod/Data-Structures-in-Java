import java.util.ArrayList;

class ArrayList{  
  public static void main(String args[]) { 
	  
    System.out.println("Making an ArrayList:\n"); 

	  // initializing an ArrayList instance
	  ArrayList<String> al = new ArrayList<String>();

	  // adding two elements with values
	  al.add("Fatiha");
	  al.add("Mulk");
	  
	  // adding an element by position
	  al.add(1, "Bakara");

	  // printing size & elements
	  System.out.println("ArrayList Size: " + al.size());
	  System.out.println("ArrayList Elements: " + al);

	  
	  // removing an element by position
	  al.remove(1);
	  // removing an element by value
	  al.remove("Fatiha");

	  // printing size & elements after value removal
	  System.out.println("\nArrayList after Deletion:\n"); 
	  System.out.println("ArrayList Size: " + al.size());
	  System.out.println("ArrayList Elements: " + al);

  } 
}
