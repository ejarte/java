import java.time.LocalDate;
public class Postit {
    private String note;
    private int year;
    private int month;
    private int day;
    private int noteNumber;
    private static int noOfNotes;

    Postit(String note){
        this.note = note;
        this.year = LocalDate.now().getYear();
        this.month = LocalDate.now().getMonthValue();
        this.day = LocalDate.now().getDayOfMonth();
        noOfNotes++;
        noteNumber = noOfNotes;

    }

    Postit(String note, int year, int month, int day){
        this.note = note;
        this.year = year;
        this.month = month;
        this.day = day;
        noOfNotes++;
        noteNumber = noOfNotes;
    }

    public void append(String s) {
        note = note + ", " + s;
    }

    public int getNoteNumber(){
        return noteNumber;
    }
    public String getNote(){
        return note;
    }

    @Override
    public String toString() {
        return "This note include note: " + note + ", First created: " + year + " " + month + " " + day;
    }
}