public class FourZeroOneK extends Account {
    private String profileRisk;
    private int deferralPercentage;
    private int accountHolderAge;

    @Override
    public String toString() {
        return "FourZeroOneK{" +
                "profileRisk='" + profileRisk + '\'' +
                ", deferralPercentage=" + deferralPercentage +
                ", accountHolderAge=" + accountHolderAge +
                ", annualContribution=" + annualContribution +
                "} " + super.toString();
    }

    private double annualContribution;

    public FourZeroOneK(int accountBalance, String accountNumber, String profileRisk, int deferralPercentage, int accountHolderAge) {
        super(accountBalance, profileRisk.equals("low") ? 5.5 : profileRisk.equals("medium") ? 7 : 8.5, accountNumber);
        this.profileRisk = profileRisk;
        this.deferralPercentage = deferralPercentage;           // constructor
        this.accountHolderAge = accountHolderAge;
    }

    public FourZeroOneK(String accountNumber, int accountHolderAge) {
        this(0,accountNumber,"low",3, accountHolderAge);
        // format for constructor chaining is the parameters are the same and in the same order except the values I want
        // to hard code. No other content is necessary in the method block except the 'this' call to source constructor
        // which will have the same format as the constructor except inclusion of hard coded values
    }


    @Override
    public void calculateMonthlyInterest(Account account) {
        System.out.println("Markets fluctuate, the following projection is based on asset history does not a guarantee return");
        if (this.profileRisk.equals("low")) {
            System.out.println("the 10 year average growth of this asset is 5.5%");
            double monthlyInterestForecast = super.getAccountBalance() * .055 / 12;
            System.out.println("Projected monthly interest is " + String.format("%.2f", monthlyInterestForecast) + " dollars");
        } else if (this.profileRisk.equals("medium")) {
            System.out.println("the 10 year average growth of this asset is 7%");
            double monthlyInterestForecast = super.getAccountBalance() * .07 / 12;
            System.out.println("Projected monthly interest is " + String.format("%.2f", monthlyInterestForecast) + " dollars");
        } else {
            System.out.println("the 10 year growth of this asset is 8.5%");
            double monthlyInterestForecast = super.getAccountBalance() * .085 / 12;
            System.out.println("Projected monthly interest is " + String.format("%.2f", monthlyInterestForecast) + " dollars");
        }
    }

    @Override
    public void deposit(double depositAmount) {
        double localAnnualContribution = annualContribution; //not sure why I had no introduce local variable. annualContribution
        //defaulted to zero but somehow in the 'else' statement, is kept getting assigned to the value of 'depositAmount' but
        // this isn't happening now with local variable
        if ((annualContribution += depositAmount) <= 22500) {
            super.deposit(depositAmount);
        } else {
            System.out.println("requested contribution would exceed annual limit. Current Annual contribution is " +
                    localAnnualContribution + ". Maximum remaining contribution amount is " + (22500 - localAnnualContribution));
        }
    }


    @Override
    public void withdraw(double withdrawAmount) {
        if (accountHolderAge < 18) {
            System.out.println("ineligible for 401k");
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
            } //appears as though I can't use a format specifier in a text block.
        } else {
            super.withdraw(withdrawAmount);
        }
    }
}


// 401k
// fields:
//riskProfile (just give 3 options)
// deferralPercentage
//methods:
//withdraw (overrided) for 65+ y/o condition and include penalty if < 65
//calculateMonthlyInterest (overrided): consider polymorphism where if risk profile is low vs med vs high, different projections given for 10 year time frame.
//deposit (overrided) incrementing sum with 22k maximum. (lets not worry about year right now but could create a deposit class with fields of amount of date to track annual contribution limit)