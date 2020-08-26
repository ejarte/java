import java.util.Date;

public class Patient {

	private String name;
	private String ssn; // social security number
	private String journal;
	
	public Patient(String name_, String ssn_) {
		name = name_; // Can't create a patient without a name
		ssn = ssn_;
		journal = "";
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public String getJournal() {
		return journal;
	}
	
	public void addToJournal(String note) {
		journal = journal + new Date().toString() +
				"; " +note + " ";
	}
	
	public String toString() {
		String info = name + ", " + ssn + ": " + journal;
		return info;
	}
}
