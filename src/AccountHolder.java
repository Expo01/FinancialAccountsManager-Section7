public class AccountHolder {
    private String name;
    private int yearOfBirth;
//    private FourZeroOneK fourZeroOneK;
//    private Roth roth;
//
//    private Checking checking;
//    private Savings savings;
//    private Brokerage brokerage;
//
    public AccountHolder(String name, int yearOfBirth, FourZeroOneK fourZeroOneK) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
//        this.fourZeroOneK = fourZeroOneK;
//        this.roth = roth;
//        this.checking = checking;
//        this.savings = savings;
//        this.brokerage = brokerage;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
