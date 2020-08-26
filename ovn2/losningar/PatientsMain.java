public class PatientsMain {

	public static void main(String[] args) {

			Patient p = new Patient("Anders Lindström", "112233-4567");
			p.addToJournal("Caught a cold.");
			p.addToJournal("Feelin' better.");
			
			System.out.println(p.toString());
	}
}
