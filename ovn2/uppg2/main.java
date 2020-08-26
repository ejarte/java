public class main {
    public static void main(String[] args) {
        // ArrayList<Student> studentArray = new ArrayList<>();
        // studentArray.add(new Student("Erik", "Data" , 40));
        Student firstStudent = new Student("Erik", "Data" , 40);
        System.out.println(firstStudent.toString());

        firstStudent.addPoints(40);
        System.out.println(firstStudent.toString());

        firstStudent.setProgram("Indek");
        System.out.println(firstStudent.toString());

        // System.out.println(studentArray.get(0).toString());

    }
}