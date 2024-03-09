interface accountDetails {
  // abstract definition for accessor methods
  public abstract String getAccHolder();

  public abstract int getAccNo();

  public abstract double getBalance();

  // default definition for getInterestRate
  public default double getInterestRate() {
    return 4.5;
  }
}

abstract class Account {
  // abstract definitions for deposit and withdraw
  public abstract void deposit(double Amount);

  public abstract void withdraw(double Amount);

  // concrete implementation of cautionMessage
  public void cautionMessage() {
    System.out.println("If action not performed by you, inform bank immediately");
  }
}

class Type_1 extends Account implements accountDetails {
  private int Acc_No;
  private String Acc_Holder;
  private double Balance;

  // instance variables Rate of type double
  private final double Rate = 4.67;

  public Type_1(int Acc_No, String Name, double Balance) {
    this.Acc_No = Acc_No;
    this.Acc_Holder = Name;
    this.Balance = Balance;
  }

  // accessor methods
  public String getAccHolder() {
    return this.Acc_Holder;
  }

  public int getAccNo() {
    return this.Acc_No;
  }

  public double getBalance() {
    return this.Balance;
  }

  public double getInterestRate() {
    return this.Rate;
  }

  // complete the deposit and withdraw methods
  public void deposit(double amount) {
    if (amount > 1000) {
      this.Balance += amount;
      System.out.println("Amount deposited successful");
    } else {
      System.out.println("Insufficient funds to deposit! Deposit unsuccessful");
    }
    cautionMessage();
  }

  public void withdraw(double amount) {
    if (amount < this.Balance) {
      this.Balance -= amount;
      System.out.println("Withdraw successful");
    } else {
      System.out.println("Insufficient funds! Withdraw unsuccessful");
    }
    cautionMessage();
  }
}

class Type_2 extends Account implements accountDetails {
  private int Acc_No;
  private String Acc_Holder;
  private double Balance;

  public Type_2(int Acc_No, String Name, double Balance) {
    this.Acc_No = Acc_No;
    this.Acc_Holder = Name;
    this.Balance = Balance;
  }

  // accessor methods
  public String getAccHolder() {
    return this.Acc_Holder;
  }

  public int getAccNo() {
    return this.Acc_No;
  }

  public double getBalance() {
    return this.Balance;
  }

  // complete the deposit and withdraw methods
  public void deposit(double amount) {
    this.Balance += amount;
    System.out.println("Amount deposited successfully");
    cautionMessage();
  }

  public void withdraw(double amount) {
    if (amount < this.Balance && amount < 20000) {
      this.Balance -= amount;
      System.out.println("Withdraw successful");
    } else if (amount > this.Balance) {
      System.out.println("Insufficient funds! Withdraw unsuccessful");
    } else {
      System.out.println("Fund requested exceeds limit! Withdraw unsuccessful");
    }
    cautionMessage();
  }
}

public class q1 {
  public static void main(String[] args) {
    Type_1 a1 = new Type_1(1002001, "Rahul", 35000);
    System.out.println(a1.getAccHolder() + "'s transactions");
    a1.deposit(500);
    a1.withdraw(10000);
    a1.deposit(2500);
    a1.withdraw(40000);
    System.out.println("\nAvailable Balance :" + a1.getBalance() + "\n");

    Type_2 a2 = new Type_2(2001007, "Pranav", 45000);
    System.out.println(a2.getAccHolder() + "'s transactions");
    a2.deposit(500);
    a2.withdraw(30000);
    a2.withdraw(15000);
    System.out.println("\nAvailable Balance :" + a2.getBalance() + "\n");
  }
}
