import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount grace = new BankAccount(1001, "Grace", 5000);
        BankAccount jane = new BankAccount(1011, "Jane", 3000);
    
        Scanner scanner = new Scanner(System.in);
        boolean records = true;

        while(records){
            System.out.println("Banking Account Simulator");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    grace.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    grace.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    grace.transfer(jane, transferAmount);
                    break;
                case 4:
                    System.out.println(grace);
                    System.out.println(jane);
                    break;            
                default:
                    records = false;
                    break;
            }
        }
        System.out.println("Program exited!");
        scanner.close();
    }


}
