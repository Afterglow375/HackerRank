package warmup;

import java.util.Scanner;

public class ManasaAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();

        for (int i = 0; i < numLines; i++) {
            int stones = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            if (a == b)
                System.out.print((stones-1)*a);
            else {
                for (int j = 0; j < stones; j++) {
                    System.out.print((j * b) + ((stones - 1 - j) * a) + " ");
                }
            }
            System.out.println();
        }
    }
}
