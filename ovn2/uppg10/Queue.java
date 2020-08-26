/**
 * @(#)Queue_skeleton.java
 *
 *                         This is a skeleton for the class Queue. If you build
 *                         your class from this skeleton, rename the file
 *                         "Queue.java".
 *
 *                         A queue (first in, first out) for String-objects
 *                         implemented with an internal array. The array is
 *                         automatically extended when needed.
 *
 * @author Anders Lindstr�m
 * @version 0.1 2015/6/11
 */

public class Queue {

    // Members
    private String[] queue;
    private int noOfElements = 0;

    // Constructors
    public Queue(int size) {
        queue = new String[size];
    }

    public Queue() {
        queue = new String[10];
    }

    public int size() { // size()
        return noOfElements;
    }

    public boolean isEmpty() {
        return noOfElements == 0;
    }

    // Mutator. Adds a string to the end of the queue.
    public void enqueue(String s) { // enque
        if (noOfElements == queue.length) {
            resize();
        }
        queue[noOfElements] = s;
        noOfElements++;
    }

    public String peek() {
        return String.valueOf(queue[0]);
    }

    public String[] getAll() {
        return queue.clone();
    }

    public String dequeue() { // deque
        if (noOfElements == 0) {
            return null;
        }

        String tempString = queue[0];

        for (int i = 0; i < noOfElements; i++) {
            pack(i);
        }

        noOfElements--;
        return tempString;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < noOfElements; i++) {
            str.append(queue[i] + ", ");
        }
        str.append("]");
        return str.toString();
    }

    // Helper methods
    private void resize() {

        String[] newQueue = new String[queue.length * 2];

        for (int i = 0; i < noOfElements; i++) {
            newQueue[i] = queue[i];
        }

        queue = newQueue;
    }

    private void pack(int pos) {
        queue[pos] = queue[pos + 1];
    }
}