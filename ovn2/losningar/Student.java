
public class Student {

	private final String name; // should not change
	private String program;
	private double credits;
	
	public Student(String name, String program) {
		this.name = name;
		this.program = program;
		this.credits = 0.0;
	}
	
	public String getname() {
		return name;
	}
	
	public String getProgram() {
		return program;
	}
	
	public double getCredits() {
		return credits;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public void addCredits(double newCredits) {
		this.credits += newCredits;
	}
	
	public String toString() {
		String info = name + ", program: " + program
				+ ", credits: " + credits;
		return info;
	}
}
