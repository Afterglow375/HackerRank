package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheLoveLetterMystery {
    static int makePalindrome(String str) {
        int reductions = 0;
        for (int i = 0; i < str.length()/2; i++) {
            reductions += Math.abs(str.charAt(i)-str.charAt(str.length() - 1 - i));
        }
        return reductions;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int numLines = Integer.parseInt(br.readLine()); // 1 <= numLines <= 10
            for (int i = 0; i < numLines; i++) {
                String str = br.readLine();
                System.out.println(makePalindrome(str));
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
