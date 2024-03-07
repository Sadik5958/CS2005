import java.util.*;

class Vowels {
  private String text;
  private int count;

  // Define the constructor
  public Vowels(String text) {
    this.text = text;
    this.count = count;
  }

  // Define the copy constructor
  public Vowels(Vowels v) {
    this.text = v.text;
    this.count = v.count;
  }

  // Define all methods mentioned in question
  public static boolean isVowel(char x) {
    if (x == 'a' || x == 'e' || x == 'i'
        || x == 'o' || x == 'u') {
      return true;
    } else {
      return false;
    }
  }

  public String getOriginalText() {
    return this.text;
  }

  public int getCount() {
    for (int i = 0; i < text.length(); i++) {
      if (isVowel(text.charAt(i))) {
        this.count++;
      }
    }
    return count;
  }

  public void manipulate() {
    String newString = "";
    for (int i = 0; i < text.length(); i++) {
      if (isVowel(text.charAt(i))) {
        newString += 'V';
      } else {
        newString += text.charAt(i);
      }
    }
  }
}

public class q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String t = sc.nextLine();
    Vowels v1 = new Vowels(t);
    Vowels v2 = new Vowels(v1);

    System.out.println(v2.getCount());
    v2.manipulate();
    System.out.println(v2.getOriginalText());
    System.out.println(v1.getOriginalText());

    sc.close();
  }
}
