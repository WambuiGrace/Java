import java.util.ArrayList;

public class Student{
    //Variables

    private String name;
    private ArrayList<Integer> scores;

    //Constructor
    public Student(String name){
        this.name = name;
        this.scores = new ArrayList<>();
    }

    //Methods
    public void addScore(int score){
        scores.add(score);
    }

    public double calculateAverage(){
        if (scores.isEmpty()) {
            return 0;
        }
        int sum = 0;

        for(int score : scores){
            sum += score;
        }
        return (double) sum / scores.size();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Integer> getScores(){
        return scores;
    }
}