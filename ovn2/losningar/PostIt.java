import java.time.LocalDate;

/**
 *
 * @author Anders Lindström, anderslm@kth.se
 */
public class PostIt {
    
     private String note;
     private LocalDate date; // last updated
     private final int number;
     
     // number of objects created, class data (static)
     private static int noOfPostIts = 0; 
     
     public PostIt(String note) {
         this.note = note;
         date = LocalDate.now(); // now
         
         noOfPostIts++; // constructor called => a new object is created
         number = noOfPostIts;
     }
     
     public String getNote() {
         return note;
     }
     
     public LocalDate getDate() {
         return date;
     }
     
     public int getNumber() {
         return number;
     }
     
     public void addNote(String newInfo) {
         note = note + "\n" + newInfo; 
         // Also, update date
         date = LocalDate.now(); // now
     }
     
     @Override
     public String toString() {
         String info = 
                 "PostIt number " + number + "\n" 
                 + note + "\nlast updated: " + date.toString();
         return info;
     }
}
