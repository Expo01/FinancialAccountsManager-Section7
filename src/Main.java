

//considerations for later: making this an array of Accounts assuming an array will accept objects of its subclasses

public class Main {
    public static void main(String[] args) {
        FourZeroOneK bobs401k = new FourZeroOneK(10000,"12345678","high",5,33);
        Checking bobsChecking = new Checking(5000,1.5,"22334455");
        Roth bobsRoth = new Roth(3000,"56568790","high",33);
        Savings bobsSaving = new Savings(6000,3,"87654321");


        AccountHolder bob = new AccountHolder("Bob", 1990, bobs401k, bobsRoth, bobsChecking, bobsSaving);


        System.out.println(bob.getChecking().getAccountBalance());
        System.out.println(bob.getSavings().getAccountBalance());
//         System.out.println(bobsSaving.getAccountBalance());   problem here is that the subclasses are not effectively
        // hidden and don't have to be called through AccountHolder ('bob'). Same output as above.
        bob.getChecking().transferFunds(300,bobsSaving);
        System.out.println(bob.getChecking().getAccountBalance()); //could make outputs more specific and say which account the balance is of
        System.out.println(bob.getSavings().getAccountBalance());

    }
}

//================================================================================
//*** 80-81: BankAccountWithConstructors:  constructor chaining
//*** 82: ConstructorChallenge: constructor chained
//92-93: WorkerInheritance: 'toString' auto-generation, static variable for incrementing total number of accounts
//stringBuilder just because
//=================================================================================



    //Savings
        //methods
            //withdraw (overrided) print output that direct withdraw not accepted, transfer only
            //transfer
    //Brokerage:
        // fields
            //for a later time, could have an array list of stocks/ETF/Indexes and sum stuff up. Get real crazy about if these assets offer dividends, etc.
        //methods
            //deposit (overrided) I think a way to demonstrate polymorphism would be to say if age of person < 18 using birthdate field of super class
                    // that they are ineligible to create an account. Must use a field form parent class to warrant use of protected keyword for use
                    //of that protected field in the subclass method condition



// 75-78: getter, setter, 'this' keyword. encapsulation with use of private fields
// 79 bankAccountChallenge: getters, setters, math methods
//exercise 30: sumCalculator: nothing new
//Exercise 31: personExercise: getters/setters, '.isEmpty', if conditions for setting of fields
//*** 80-81: BankAccountWithConstructors: get/set, constructor, constructor overloading with default parameters + constructor chaining + math method
//*** 82: ConstructorChallenge: constructor chained of 3 constructor methods one has only default parameters
//exercise 32: wall area: nothing new
//*** exercise 33: Point: creation of class with 2 fields for an instance. method in class which accepts a parameter of its own
//              class type and uses its component field values for computation
//*** exercise 34: CarpetCostCalculator: 3 classes. third class fields are the object types of other 2 classes. performs math in each and gives output
//exercise 35: complexNumber: nothing new
// 88-90: AnimalClass: inheritance. 'super.toString', constructor chaining, nested ternary for deriving information for a parameter instead of passing a value
//                //over-rided methods from parent class, fields and methods local to subclass. use of protected field from parents class for use in subclass method condition
//                // in this problem, if type == wolf, then local method in Dog class changes its output. demonstrates polymorphism where baseclass method has different outputs
//                // depending on subclass type
// 92-93: WorkerInheritance: complete. parent class, subclass, subclasses of subclass, method overriding
//…             'toString' auto-generation, .substring method of String class, static variable for incrementing total count of
// (gotta search this in the search bar for some reason.... its actually missing one class in the version i cans ee. reference video 1 at minute 11)
//              instances under parent class umbrella, use of default assignment of primitive type field for implicit constructor value
// exercise 36: CircleAndCylinder nothing new. if criteria for setting fields. inheritance math. done.
// exercise 37: Pool: nothing new.
// 96: TextBlockEscapeSequenceFormatSpecifier: \t, %d, , \n, %n, %f, precision specification decimal places with %f, String.format, textblock, align right using precision specification %d
//97: StringInspectionAndComparison: %c, string.length, string.isEmpty, string.isBlank, stringObject.equals, stringObject.equalsIgnoreCase, stringObject.startsWith
// stringObject.endsWith, stringObject.contains, stringObject.contentEquals
// 98: StringManipulationMethods: string manipulation methods: .substring, .join, .concat, .replace. .replaceFirst,
                                // .replaceAll, .repeat, .indent. Plus brief contrived constructor chaining
//99: StringBuilder: methods: .append, .repeat, .deleteCharAt, .replace, .reverse, .setLength, .capacity