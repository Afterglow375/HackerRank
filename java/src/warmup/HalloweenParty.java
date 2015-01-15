package warmup;

import java.util.Scanner;

public class HalloweenParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();

        for (int i = 0; i < numLines; i++) {
            int cuts = sc.nextInt();
            int half = cuts/2;
            System.out.println((long) half * (cuts - half));
        }
    }
}
