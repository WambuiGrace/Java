
public class PayrollApp {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("1a01", "Jane Doe", "Engineering", 70000.00, 15000.00);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("102", "John Doe", "Marketing", 65000.00, 50);
        Contractor contractor = new Contractor("104", "Leslie Jones", "Maintenance", 500000.00, 15);

        System.out.println("INDIVIDUAL PAYROLL BREAKDOWN");

        System.out.println("Fulltime -> Name: " + fullTimeEmployee.getName());
        System.out.println("Total salary with bonus: " + fullTimeEmployee.calculateSalary());

        
        System.out.println("Parttime -> Name: " + partTimeEmployee.getName());
        System.out.println("Total salary: " + partTimeEmployee.calculateSalary());

        
        System.out.println("Contractor -> Name: " + contractor.getName());
        System.out.println("Total salary with bonus: " + contractor.calculateSalary());
    }
}
