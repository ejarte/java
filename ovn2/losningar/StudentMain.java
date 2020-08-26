
public class StudentMain {

	public static void main(String[] args) {

		Student s = new Student("Anders", "TIDAA");
		System.out.println(s.toString());
		
		s.addCredits(8.0); // passed HI1027
		System.out.println(s.toString());
	}

}
