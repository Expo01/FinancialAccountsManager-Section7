public class AccountHolder {
    private String name;
    private int yearOfBirth;
    private FourZeroOneK fourZeroOneK;
    private Roth roth;
    private Checking checking;

    @Override
    public String toString() {
        return "AccountHolder{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", fourZeroOneK=" + fourZeroOneK +
                ", roth=" + roth +
                ", checking=" + checking +
                ", savings=" + savings +
                '}';
    }

    private Savings savings;

    public AccountHolder(String name, int yearOfBirth, FourZeroOneK fourZeroOneK, Roth roth, Checking checking, Savings savings) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.fourZeroOneK = fourZeroOneK;
        this.roth = roth;
        this.checking = checking;
        this.savings = savings;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public FourZeroOneK getFourZeroOneK() {
        return fourZeroOneK;
    }

    public Roth getRoth() {
        return roth;
    }

    public Checking getChecking() {
        return checking;
    }

    public Savings getSavings() {
        return savings;
    }
}
