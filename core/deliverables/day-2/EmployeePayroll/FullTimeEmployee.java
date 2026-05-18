public class FullTimeEmployee extends Employee implements Bonus {
    private double monthlyBonus;
    private double baseSalary;

    public FullTimeEmployee(String id, String name, String department, double monthlyBonus, double baseSalary){
        super(id, name, department);
        this.monthlyBonus = monthlyBonus;
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateBonus(){
        return monthlyBonus;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + monthlyBonus;
    }
}
