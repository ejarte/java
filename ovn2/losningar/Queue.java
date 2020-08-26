/**
 * A queue, i.e. a first-in-first-out structire, for String objects. 
 * The internal capacity of the queue (the length of the internal array) 
 * is doubled when the array is full.
 * 
 * @author Anders Lindström, anderslm@kth.se
 *
 */
public class Queue {
	
	private String[] theElements;
	private int noOfElements;
	
	/**
	 * Creates a new queue with the indicated initial capacity.
	 * @param capacity the inital capacity
	 */
	public Queue(int capacity) {
		theElements = new String[capacity];
		noOfElements = 0;
	}
	
	/**
	 * Creates a new queue with an initial capacity of 10.
	 * @param capacity the inital capacity
	 */
	public Queue() {
		theElements = new String[10];
		noOfElements = 0;
	}

	/**
	 * Returns the size of the queue, i.e. the number of elements stored.
	 */
	public int size() {
		return noOfElements;
	}
	
	/**
	 * Returns whtether this queue is empty or not.
	 */
	public boolean isEmpty() {
		return noOfElements == 0;
	}
	
	/**
	 * Adds a new element to the end of the queue.
	 * @param newElement
	 */
	public void enqueue(String newElement) {
		if(noOfElements >= theElements.length) resize();
		theElements[noOfElements] = newElement;
		noOfElements++;
	}
	
	/**
	 * Returns the first element of the queue, and removes it from the queue.
	 */
	public String dequeue() {
		String temp = theElements[0];
		// pack the array
		for(int i = 0; i < noOfElements-1; i++) {
			theElements[i] = theElements[i+1];
		}
		noOfElements--;
		return temp;
	}
	
	/**
	 * Returns the first element of the queue, not removing it from the queue..
	 */
	public String peek() {
		return theElements[0];
	}
	
	/**
	 * Returns the elements in the queue.
	 */
	public String[] getAll() {
		// create a _copy_ of the array
		String[] temp = new String[noOfElements];
		for(int i = 0; i < noOfElements; i++) {
			temp[i] = theElements[i];
		}
		return temp;
	}
	
	/**
	 * Returns a string representation of the queue.
	 */
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("[");
		for(int i = 0; i < noOfElements; i++) {
			info.append(theElements[i]+";"); 
		}
		return info.toString();
		
	}
	
	// double the capacity
	private void resize() {
		String[] temp = new String[theElements.length*2];
		// copy the elements
		for(int i = 0; i < noOfElements; i++) {
			temp[i] = theElements[i];
		}
		// let member theElements reference the new array
		theElements = temp;	
	}
}
