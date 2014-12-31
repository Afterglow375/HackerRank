package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatingCharacters {
    static int deleteChars(String str) {
        int altCharCount = 1;
        char prevChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (prevChar != currChar) {
                prevChar = currChar;
                altCharCount++;
            }
        }
        return str.length() - altCharCount;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int numLines = Integer.parseInt(br.readLine()); // 1 <= numLines <= 10
            for (int i = 0; i < numLines; i++) {
                String str = br.readLine();
                System.out.println(deleteChars(str));
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
