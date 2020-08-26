import java.time.LocalDate;

public class Postit {
    private String note;
    private int year;
    private int month;
    private int day;

    Postit(String note){
        this.note = note;
        this.year = LocalDate.now().getYear();
        this.month = LocalDate.now().getMonthValue();
        this.day = LocalDate.now().getDayOfMonth();
    }

    Postit(String note, int year, int month, int day){
        this.note = note;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void append(String s) {
        note = note + ", " + s;
    }

    public String getNote(){
        return note;
    }

    @Override
    public String toString() {
        return "This note include note: " + note + ", First created: " + year + " " + month + " " + day;
    }
}