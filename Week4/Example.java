// GRPA-1
import java.util.*;

abstract class StringOperations {
  public abstract String reverse(String s);

  public abstract int vowelCount(String s);
}

// Fill the code here
class StringReverse extends StringOperations {
  public String reverse(String s) {
    String rstr = "";
    // Reverse the String s
    for (int i = s.length() - 1; i >= 0; i--) {
      rstr += s.charAt(i);
    }
    // Return the reversed String
    return rstr;
  }

  public int vowelCount(String s) {
    // This method needs to implemented,
    // but we can return 0 as placeholder
    return 0;
  }
}

class UpdatedStrings extends StringReverse {
  public int vowelCount(String s) {
    s = s.toLowerCase();
    int count = 0;
    // Count the vowel in string s
    for (int i = 0; i < s.length(); i++) {
      // check if char[i] is vowel
      if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
          || s.charAt(i) == 'o'
          || s.charAt(i) == 'u'
          || s.charAt(i) == 'i') {
        count++;
      }
    }
    // Return number of vowels
    return count;
  }
}

class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    UpdatedStrings str = new UpdatedStrings();
    System.out.println("Reverse of " + s + " is " + str.reverse(s));
    System.out.println("Vowel count of " + s + " is " + str.vowelCount(s));
  }
}
