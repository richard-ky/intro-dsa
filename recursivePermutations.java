import java.util.Scanner;

public class recursivePermutations {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = "";

    System.out.print("Enter string: ");
    s = in.next();
    displayPermutation(s);

    in.close();
  }

  static void displayPermutation(String s) {
    displayPermutation("", s);
  }

  static void displayPermutation(String s1, String s2) {
    if (s2.isEmpty()) {
      System.out.println(s1);
    } else {
      for (int i = 0; i < s2.length(); i++) {
        displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
      }
    }
  }
}
