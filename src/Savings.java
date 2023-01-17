public class Savings extends Account{

    private boolean feeExemption;

    public Savings(int accountBalance, double interestRate, String accountNumber) {
        super(accountBalance, interestRate, accountNumber);
        this.feeExemption = (accountBalance > 1000)? true:false;
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
    public double getAccountBalance() {
        if (super.getAccountBalance() < 1000){
            System.out.println("savings account balance is less than $1,000 and holder will be subjected to monthly fee");
            feeExemption = false;
        }
        return super.getAccountBalance();
    }

    public void transferFunds(double transferAmount, Account transferAccount){
        transferAccount.deposit(transferAmount);
        withdraw(transferAmount);
        System.out.println("transfer amount of " + transferAmount +  " has been transferred to " + transferAccount);
    }
}
