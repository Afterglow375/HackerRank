package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UtopianTree {
    public static void calcHeights(int cycleIndex, int num, int[] cycles) {
        while (cycleIndex < num+1) {
            if (cycleIndex % 2 == 0) { // if cycleIndex is even
                cycles[cycleIndex] = cycles[cycleIndex-1] + 1;
            }
            else {
                cycles[cycleIndex] = cycles[cycleIndex - 1] * 2;
            }
            cycleIndex++;
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int numLines = Integer.parseInt(br.readLine()); // 1 <= numLines <= 10
            int cycleIndex = 1;
            int[] cycles = new int[61];
            cycles[0] = 1; // Height of tree starts at 1

            for (int i = 0; i < numLines; i++) {
                int num = Integer.parseInt(br.readLine());
                if (cycles[num] == 0) {
                    calcHeights(cycleIndex, num, cycles);
                    System.out.println(cycles[num]);
                }
                else {
                    System.out.println(cycles[num]);
                }
            }

            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
