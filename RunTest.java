package Week14Homework;

public class RunTest {

    public static void main(String[] args) {
        //For inheritance concept I created one parent class which is Bank class
        //And barclays,hsbc and tsb are child class
        //And to Implement this concept I created one object

        //Bank is class name
        //new is create the object
        //bank is object reference variable

        Bank bank = new Bank();
        bank.withdrawal();
        bank.deposit();
        bank.payment();
        bank.transfer();


        System.out.println();

        Barclays barclays = new Barclays();
        barclays.withdrawal();
        barclays.deposit();
        barclays.payment();
        barclays.transfer();
        barclays.interestRate();


        System.out.println();

        Hsbc hsbc = new Hsbc();
        hsbc.withdrawal();
        hsbc.deposit();
        hsbc.payment();
        hsbc.transfer();
        hsbc.interestRate();

        System.out.println();

        Tsb tsb = new Tsb();
        tsb.withdrawal();
        tsb.deposit();
        tsb.payment();
        tsb.transfer();
        tsb.interestRate();

        System.out.println();


    }
}
