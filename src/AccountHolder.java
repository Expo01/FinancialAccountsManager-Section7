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

    public AccountHolder(int yearOfBirth, FourZeroOneK fourZeroOneK, Roth roth, Checking checking){
        this("default",yearOfBirth,fourZeroOneK,roth,checking,new Savings(0,0,"00000000"));
    } //seems as though I can use constructor chaining even with composition and can hard code in the fields of a component Class by using the
    // 'new' keyword in the 'this' call


    public AccountHolder(String name, int yearOfBirth, Checking checking, Savings savings) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.checking = checking;
        this.savings = savings;
        //suppose a person's age was known beforehand such that they are inelligible for gov accounts, I can do constructor overloading
        // withouth constructor chaining through the 'this' keyword.
        // In reality there would be options for a person to have whatever mix of accounts they do and don't want, but that would be
        // a ton of code, so I imagine there would be a way that the use selects which accounts they want, the other non-used accounts
        // would go to default parameters and then accounts that have not been initialized by some variable would not be accessible
        //or displayed to the user
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
