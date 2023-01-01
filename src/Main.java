public class Main {
    public static void main(String[] args) {


    }
}

//section 7 concept integration- bank account is best idea i think but we can have base account and inherit from base
//for things like savings, vs 401k, vs brokerage which all do different stuff and have some maths involved
//THINKING ABOUT STATE AND BEHAVIOR OF ALL CLASSES/OBJECTS
    //main -->
        // Account holder: separate class. no Inheritance. fields: name, DOB, SSN, address,
        // Bank/Branch? its all online.. not really relevant.. i don't know mine that's for sure...
        // Account base class: accepts AccountHolder as a field? Maybe accepts a bank as a field too?
                            // All accounts should have a value, have interest accrual potential, have an open/close date
                            //require a signature
            //401k
            //checking
            //Roth IRA
            //Savings
            //Brokerage: boolean confirmation of risk
            //option account: ?

//consider using indexOf, startingIndex, and .substring to print just the last 4 of SSN or only print the last digits of the account

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