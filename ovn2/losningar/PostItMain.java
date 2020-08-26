/**
 *
 * @author Anders Lindström, anderslm@kth.se
 */
public class PostItMain {

    public static void main(String[] args) {
        PostIt p = new PostIt("Buy milk");
        p.addNote("Call the doctor");
        
        PostIt q = new PostIt("Feed the cat");
        q.addNote("...and the dog");
        
        PostIt r = new PostIt("Relax");
        r.addNote("Go to the cinema");
        
        System.out.println(p.toString());
        System.out.println("---");
        System.out.println(q.toString());
        System.out.println("---");
        System.out.println(r.toString());
    }
}
