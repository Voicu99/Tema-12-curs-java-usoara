// Bank.java
abstract class Bank {
    abstract int getBalance();
}

// BankA.java
class BankA extends Bank {
    @Override
    int getBalance() {
        return 100;
    }
}

// BankB.java
class BankB extends Bank {
    @Override
    int getBalance() {
        return 150;
    }
}

// BankC.java
class BankC extends Bank {
    @Override
    int getBalance() {
        return 200;
    }
}
