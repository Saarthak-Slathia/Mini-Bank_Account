class Account {
    double balance;
    double amount;
    String accountName;
    double currency;
    String currencyType;

    // Constructor for creating a new bank account.
    Account(String name) {
        accountName = name;
    }

    Account() {
        accountName = "unnamed account";
    }

    public void deposit(double a) {
        balance = amount + a;
    }

    public void withdraw(double a) {
        balance = amount - a;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyType() {
        return currencyType;
    }
}

class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("My Account");
        myAccount.deposit(40);
        double mybalance = myAccount.getBalance();
        System.out.println(mybalance);
        System.out.println(myAccount.amount);
        System.out.println(myAccount.getAccountName());
    }
}