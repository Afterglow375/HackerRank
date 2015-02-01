package warmup;

import java.util.Scanner;

public class LonelyInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInts = sc.nextInt();
        int[] numbers = new int[101];

        for (int i = 0; i < numInts; i++) {
            numbers[sc.nextInt()]++;
        }

        for (int i = 0; i < 101; i++) {
            if (numbers[i] == 1) {
                System.out.println(i);
                return;
            }
        }
    }
}
