public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println(queue.isEmpty());
        queue.enqueue("test");
        queue.enqueue("test2");
        queue.enqueue("test3");
        queue.enqueue("test4");
        queue.enqueue("test5");
        queue.enqueue("test6");

        System.out.println(queue.dequeue());

        System.out.println(queue.toString());

    }

}