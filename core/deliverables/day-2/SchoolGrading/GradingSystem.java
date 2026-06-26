import java.util.ArrayList;
import java.util.Collections;

public class GradingSystem {
    private ArrayList<Student> students;

    //Constructor
    public GradingSystem(){
        this.students = new ArrayList<>();
    }

    //Method
    public void addStudent(Student student){
        students.add(student);
    }

    //Method
    public void generateReportCards(){
        System.out.println("==Report Cards==");
        for (Student s : students){
            System.out.println("Name: "+s.getName());
            System.out.println("Scores: "+s.getScores());
            System.out.println("Average: "+s.calculateAverage());
            System.out.println();
        }
    }

    //Method
    public void rankStudents(){
        System.out.println("==Student  Rankings==");
        Collections.sort(students, (a, b) -> 
            Double.compare(b.calculateAverage(), a.calculateAverage())
        );
        int position = 1;
        for (Student s : students){
            System.out.println(position + "."+s.getName() + "- Average: "+s.calculateAverage());
            position++;
        }
    }
}
