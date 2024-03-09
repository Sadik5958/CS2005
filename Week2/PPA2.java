import java.util.*;

class Point {
  private int x, y;

  // implement the constructor and
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // override the toString() and equals() methods
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  public boolean equals(Object obj) {
    if (obj instanceof Point) {
      Point other = (Point) obj;
      return this.x == other.x && this.y == other.y;
    }
    return false;
  }
}

class PPA2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();

    Point p1 = new Point(x1, y1);
    Point p2 = new Point(x2, y2);

    if (p1.equals(p2))
      System.out.println(p1 + "==" + p2);
    else
      System.out.println(p1 + "!=" + p2);
  }
}
