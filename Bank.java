
package Basics;

class Bank {

    void interestRate() {
        System.out.println("Bank interest rate is 5%");
    }
}

class SavingsAccount extends Bank {

    @Override
    void interestRate() {
        System.out.println("Savings Account interest rate is 7%");
    }
}

 class BankDemo {

    public static void main(String[] args) {

        Bank b = new Bank();
        b.interestRate();

        SavingsAccount s = new SavingsAccount();
        s.interestRate();
    }
}
