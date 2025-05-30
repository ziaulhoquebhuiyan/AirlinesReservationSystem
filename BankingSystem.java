class Bank {
    String name;
    List<Account> accounts;

    void addAccount(Account account) {}
    void closeAccount(Account account) {}
}

class Account {
    String accountNumber;
    double balance;
    Customer owner;

    void deposit(double amount) {}
    void withdraw(double amount) {}
}

class Customer {
    String name;
    String customerID;
    List<Account> accounts;

    void openAccount(Bank bank) {}
    void closeAccount(Account account) {}
}