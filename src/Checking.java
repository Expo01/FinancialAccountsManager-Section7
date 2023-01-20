public class Checking extends Account{
    private boolean feeExemption;

    public Checking(int accountBalance, double interestRate, String accountNumber) {
        super(accountBalance, interestRate, accountNumber);
        this.feeExemption = (accountBalance > 1000)? true: false;
    }

    public Checking(double interestRate, String accountNumber) {
        this(0,interestRate,accountNumber);
    }

    @Override
    public void calculateMonthlyInterest(Account account) {
        super.calculateMonthlyInterest(account);
    }

    @Override
    public void deposit(double depositAmount) {
        super.deposit(depositAmount);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        super.withdraw(withdrawAmount);
    }

    @Override
    public void displayLastFourOfAccountNumber() {
        super.displayLastFourOfAccountNumber();
    }

    @Override
    public String toString() {
        return "Checking{" +
                "feeExemption=" + feeExemption +
                "} " + super.toString();
    }

    @Override
    public double getAccountBalance() {
        if (super.getAccountBalance() < 1000){
            System.out.println("checking account balance is less than $1,000 and holder will be subjected to monthly fee");
            feeExemption = false;
        }
        return super.getAccountBalance();
    }

    public void transferFunds(double transferAmount, Account transferAccount){
        transferAccount.deposit(transferAmount);
        withdraw(transferAmount);
        System.out.println("transfer amount of " + transferAmount +  " has been transferred to " + transferAccount);
        //this works but does not exclude transfer of funds into 401k which shouldn't happen from checking
    }

}


//checking
    //field
        //feeExemption: lets use a ternary to derive feeExemption status from accountBalance if over 1,000 or something
    //methods
        //transferFunds: deduct value from account and add the value to another account
