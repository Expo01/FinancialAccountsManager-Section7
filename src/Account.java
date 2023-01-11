public class Account {

    private double accountBalance;
    private double interestRate;
    private String accountNumber;


    public Account(int accountBalance, double interestRate, String accountNumber) {
        this.accountBalance = accountBalance;
        this.interestRate = interestRate;
        this.accountNumber = accountNumber;

    }

    public void calculateMonthlyInterest(Account account) {
        double monthlyInterest = (account.accountBalance * (account.interestRate / 100) / 12);
        System.out.println(String.format("%.2f", monthlyInterest) + " dollars of monthly positive interest"); // 'sout' used instead of 'souf' to allow additional text outside of .format structure
    }

    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;

        System.out.println("your account balance is now " + String.format("%.2f", this.accountBalance));
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= this.accountBalance) {
            this.accountBalance -= withdrawAmount;

            System.out.println("your account balance is now " + String.format("%.2f", this.accountBalance));
        } else {
            System.out.println("insufficient funds for withdraw amount of " + String.format("%.2f",withdrawAmount) + " dollars");
        }
    }

    public void displayLastFourOfAccountNumber(){
        int lastFourOfAccountNumber =  Integer.parseInt(accountNumber.substring(4));
        System.out.println("Account number: xxxx" + lastFourOfAccountNumber);
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}

// Account super class:
    // fields
        // accountBalance, annualInterestRate, accountNumber
        //static variable not included in constructor to increment with each creation of a subclass of Account?
    //Methods:
        //interestProjection(Account object) derives its field values interestRate and accountBalance /12 to = monthlyInterestProjection
            //StringBuilder: just use it in output instead of strings just because I can
            //TextBlockEscapeSequenceFormatSpecifier: \t, %d, \n, %n, %f, precision specification decimal places with %f,
            //String.format, textblock,
    //withdraw
    //deposit
    //displayLastFourOfAccountNumber
        //consider using indexOf, startingIndex, and .substring to print just the last 4 of account#