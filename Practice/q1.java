import java.util.*;

class Bills {
  static double discount = 0.1;
  private String name;
  private String[] items;
  private int billAmt;
  private double discountedAmt;

  // Define the constructor for class Bills
  public Bills(String name, int amount, String[] items) {
    this.name = name;
    this.billAmt = amount;
    this.items = items;
    this.discountedAmt = this.billAmt - (this.billAmt * discount);
  }

  // Define the copy constructor for class Bills
  public Bills(Bills b) {
    this.name = b.name;
    this.billAmt = b.billAmt;
    this.discountedAmt = b.discountedAmt;
    this.items = new String[b.items.length];
    for (int i = 0; i < items.length; i++) {
      this.items[i] = b.items[i];
    }
  }

  // complete the methods in accordance with the test cases provided
  public String getName() {
    return this.name;
  }

  public double getDiscountAmt() {
    return this.discountedAmt;
  }

  public void changeItem(String itemName) {
    this.items[0] = itemName;
  }

  public void printBill() {
    System.out.println("Name : " + this.name);
    System.out.println("Bill Amount : " + this.billAmt);
    System.out.println("Discounted Amount : " + this.discountedAmt);
    System.out.print("Items : ");
    for (int i = 0; i < items.length; i++) {
      System.out.print(items[i] + " : ");
    }
  }
}

public class q1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String items[] = { "Apples", "Oranges", "Guava" };
    String name = sc.nextLine();
    int billAmt = sc.nextInt();

    Bills b1 = new Bills(name, billAmt, items);
    Bills b2 = new Bills(b1);
    b2.changeItem("Banana");

    System.out.println(b2.getDiscountAmt());
    b1.printBill();

    sc.close();
  }
}
