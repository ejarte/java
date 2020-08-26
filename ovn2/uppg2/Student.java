public class Student {
    String name;
    String program;
    int points;

    Student() {

    }

    Student(String name, String program, int points) {
        this.name = name;
        this.program = program;
        this.points = points;
    }

    int addPoints(int points){
        this.points += points;
        return this.points;
    }

    String setProgram(String program) {
        this.program = program;
        return this.program;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Program: " + program + ", points: " + points;
    }
}