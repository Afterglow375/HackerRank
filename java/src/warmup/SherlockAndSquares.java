package warmup;

import java.util.Scanner;

public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();

        for (int i = 0; i < numLines; i++) {
            int lo = sc.nextInt();
            int hi = sc.nextInt();

            int lowRoot = (int) Math.ceil(Math.sqrt(lo));
            int hiRoot = (int) Math.floor(Math.sqrt(hi));
            System.out.println(hiRoot - lowRoot + 1);
        }
    }
}
