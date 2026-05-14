class BankAccount{
    private int accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(int accountNumber, String accountName, int balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountName(){
        return accountName;
    }
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        return "Account: " +accountNumber+ "| Name: " +accountName+ "| Balance: " +balance;
    }

    public void deposit(double amount){
        //Check invalid amount
        if (amount <= 0) {
            System.out.println("\u001B[31Deposit amount must be greater than zero!\u001B[0m");
            return;
        }

        
        balance = balance + amount;
        System.out.println("Deposited: " +amount+ ". New balance: " +balance);
    }

    public void withdraw(double amount){
        //Check invalid amount
        if (amount <= 0) {
            System.out.println("\u001B[31mAmount must be greater than zero.\u001B[0m");
            return;
        }
        //Check insufficient balance
        if (amount > balance) {
            System.out.println("Insufficient funds. Balance is: "+balance);
            return;
        }
        //Passed check
        balance = balance - amount;
        System.out.println("Withdrawn: "+amount+ ". New balance: "+balance);

    }

    public void transfer(BankAccount target, double amount){
        this.withdraw(amount);
        target.deposit(amount);
    }
}