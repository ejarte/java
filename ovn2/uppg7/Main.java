public class Main {
    public static void main(String[] args) {
        Postit postit = new Postit("hej hej");

        System.out.println(postit.toString());

        System.out.println(postit.getNoteNumber());
        Postit newPostit = new Postit("hej hej");
        System.out.println(newPostit.getNoteNumber());

    }
}