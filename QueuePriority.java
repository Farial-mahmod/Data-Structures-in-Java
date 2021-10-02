import java.util.Queue;
import java.util.PriorityQueue;


class QueuePriority {  
  public static void main(String args[]) { 
  

	Queue<String> pq = new PriorityQueue<>();

  // adding elements to the Queue
  pq.add("Sparrow");
	pq.add("Parrot");


	System.out.println("Added into the Queue: " + pq); 
    
  // size of the Queue  
	System.out.println("\nQueue Size: " + pq.size()); 

    
	while(pq.peek() != null)
    System.out.println("\nPopping the Queue: " + pq.remove()); 
    
    
  } 
	
}
