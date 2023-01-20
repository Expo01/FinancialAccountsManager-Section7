public class Roth extends Account {

    private String riskProfile;
    private int accountHolderAge;
    private double annualContribution;

    public Roth(int accountBalance, String accountNumber, String riskProfile, int accountHolderAge) {
        super(accountBalance, riskProfile.equals("low") ? 5.5 : riskProfile.equals("medium") ? 7 : 8.5, accountNumber);
        this.riskProfile = riskProfile;
        this.accountHolderAge = accountHolderAge;
    }

    public Roth(String accountNumber, int accountHolderAge) {
        this(0, accountNumber, "low", accountHolderAge);
    }


    @Override
    public String toString() {
        return "Roth{" +
                "riskProfile='" + riskProfile + '\'' +
                ", accountHolderAge=" + accountHolderAge +
                ", annualContribution=" + annualContribution +
                "} " + super.toString();
    }

    @Override
    public void calculateMonthlyInterest(Account account) {
        super.calculateMonthlyInterest(account);
    }

    @Override
    public void deposit(double depositAmount) {
        double localAnnualContribution = annualContribution;
        if ((annualContribution += depositAmount) <= 6000) {
            super.deposit(depositAmount);
        } else {
            System.out.println("requested contribution would exceed annual limit. Current Annual contribution is " +
                    localAnnualContribution + ". Maximum remaining contribution amount is " + (6000 - localAnnualContribution));
        }
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if (accountHolderAge < 18) {
            System.out.println("ineligible for Roth");
        }
        if (accountHolderAge < 65 && accountHolderAge >= 18) {
            if (super.getAccountBalance() < withdrawAmount * 1.15) {
                System.out.println("insufficient funds for withdraw amount of " + withdrawAmount);
            } else {
                System.out.println("Early withdrawal penalty incurred.\n" +
                        "Account deducted by value of 15% of requested withdrawal.\n" +
                        "Withdrawal amount of " + withdrawAmount + " approved.\n" + //need format specifier for decimals
                        "account penalized " + (withdrawAmount * .15) + " dollars"); //need format specifier for decimals
                super.withdraw(withdrawAmount * 1.15);
            }
        } else {
            super.withdraw(withdrawAmount);
        }
    }

    @Override
    public void displayLastFourOfAccountNumber() {
        super.displayLastFourOfAccountNumber();
    }

    @Override
    public double getAccountBalance() {
        return super.getAccountBalance();
    }
}




//Roth IRA
    //fields:
        //riskProfile (for simplicity just repeat this and limit options)
    //methods
        //withdraw (overrided) for 65+ y/o condition and include penalty if < 65
        //deposit (overrided) incrementing sum up to 6,000 maximum