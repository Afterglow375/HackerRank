package warm.up;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDigits {
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        	int numLines = Integer.parseInt(br.readLine()); // 1 <= numLines <= 15
        	for (int i = 0; i < numLines; i++) {
        		int num = Integer.parseInt(br.readLine());
        		System.out.println(dividingDigitCount(num));
        	}
			br.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	public static int dividingDigitCount(int i) {
		int dividingCount = 0;
		int original = i;
		
		while (i != 0) {
			int remainder = i % 10;
			i /= 10;
			if (remainder != 0 && original % remainder == 0) {
				dividingCount++;
			}
		}
		
		return dividingCount;
	}
}
