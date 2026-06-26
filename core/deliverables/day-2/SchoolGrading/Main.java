

public class Main {
    public static void main(String[] args) {
        GradingSystem system = new GradingSystem();

        Student student1 = new Student("Grace");
        Student student2 = new Student("Alice");
        Student student3 = new Student("Charlie");
        Student student4 = new Student("Bob");

        student1.addScore(85);
        student1.addScore(55);
        student1.addScore(45);

        student2.addScore(87);
        student2.addScore(65);
        student2.addScore(35);

        student3.addScore(85);
        student3.addScore(67);
        student3.addScore(95);

        student4.addScore(80);
        student4.addScore(78);
        student4.addScore(95);

        system.addStudent(student1);
        system.addStudent(student2);
        system.addStudent(student3);
        system.addStudent(student4);

        System.out.println("--Generating report cards--");
        system.generateReportCards();

        System.out.println("--Student rankings--");
        system.rankStudents();
    }
}
