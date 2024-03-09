import java.util.Scanner;

class Account {
  // static variables
  public static int[] account_numbers;
  private static int current_account_no = 0;
  private static Account new_account;

  private Account() {
    current_account_no++;
  }

  public static Account getAccount() {
    if (new_account == null) {
      new_account = new Account();
    }
    return new_account;
  }

  public void firstTransaction() {
    System.out.println("Transaction for account " + account_numbers[0] + " in process");
    Transaction.makeNextTransaction();
  }

  public void processTransaction() {
    System.out.println("Transaction " + current_account_no + " for account " + account_numbers[current_account_no - 1]
        + " in process");
  }
}

class Transaction {
  // static variables
  public static int total_no_of_transactions;
  private static int transaction_count = 1;

  public static void makeNextTransaction() {
    System.out.println("Transaction number " + transaction_count + " completed!");

    if (transaction_count < total_no_of_transactions) {
      transaction_count++;
      Account a = Account.getAccount();
      a.processTransaction();
    }
  }
}

public class callback {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Transaction.total_no_of_transactions = in.nextInt();
    Account.account_numbers = new int[Transaction.total_no_of_transactions];

    System.out.println("Enter account numbers:");
    for (int i = 0; i < Transaction.total_no_of_transactions; i++) {
      Account.account_numbers[i] = in.nextInt();
    }

    Account a = Account.getAccount();
    a.firstTransaction();

    in.close();
  }
}
