
public class Contractor extends Employee {
    private double dailyRate;
    private double daysWorked;

    public Contractor(String id, String name, String department, double dailyRate, double daysWorked){
        super(id, name, department);
        this.dailyRate = dailyRate;
        this.daysWorked = daysWorked;
    }

    @Override
    public double calculateSalary(){
        return dailyRate * daysWorked;
    }

    public double getDailyRate(){
        return dailyRate;
    }
    public void setDailyRate(double dailyRate){
        this.dailyRate = dailyRate;
    }

    public double getDaysWorked(){
        return daysWorked;
    }
    public void setDaysWorked(double daysWorked){
        this.daysWorked = daysWorked;
    }

}
