
public class QueueMain {

	public static void main(String[] args) {

		Queue q = new Queue(4);
		
		q.enqueue("Buy a textbook");
		q.enqueue("Follow the lectures");
		q.enqueue("Read the textbook");
		q.enqueue("Write code");
		System.out.println(q.toString());
		
		q.enqueue("Do the exercises");
		q.enqueue("Do it again");
		System.out.println(q.toString());
		
		String s = q.dequeue();
		System.out.println("Dequeued: " + s);
		
		s = q.peek();
		System.out.println("Peeked at: " + s);
		
		System.out.println(q.toString());
	}
}
