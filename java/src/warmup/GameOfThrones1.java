package warmup;

import java.util.Scanner;

public class GameOfThrones1 {
    // Returns "YES" if the given string has an anagram that is a palindrome, "NO" otherwise
    static String possiblePalindrome(String str) {
        int[] charCounts = new int[26];
        for (int i = 0; i < str.length(); i++)
            charCounts[str.charAt(i) - 'a']++;

        // If string length is even, can't be any odd number of chars
        // If string length is odd, one odd number of chars is needed
        int oddChars = 0;
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] % 2 == 1)
                oddChars++;
        }

        if (str.length() % 2 == 0) {
            if (oddChars == 0)
                return "YES";
        }
        else {
            if (oddChars == 1)
                return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(possiblePalindrome(str));
    }
}
