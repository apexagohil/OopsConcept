package Week14Homework;

public class Barclays extends Bank{
    //Bank class has interest rate method
    //So I have overridden that method in barclays class
    // which is called polymorphism

    @Override
    public void interestRate() {
        System.out.println("Barclays interest rate 4%");
    }
}


