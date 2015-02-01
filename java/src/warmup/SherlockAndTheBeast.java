package warmup;

import java.util.Scanner;

public class SherlockAndTheBeast {
    public static void buildNum(int threesCount, int fivesCount) {
        for (int i = 0; i < threesCount; i++) {
            System.out.print("555");
        }
        for (int i = 0; i < fivesCount; i++) {
            System.out.print("33333");
        }

        System.out.println();
    }

    public static void solve(int num) {
        // if no solution, print -1
        if (num < 3 || num == 4 || num == 7) {
            System.out.println("-1");
            return;
        }

        int originalNum = num;
        while (num == 0 || num > 2) {
            if (num % 3 == 0) {
                buildNum(num/3, (originalNum - num)/5);
                return;
            }
            num -= 5;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();

        for (int i = 0; i < numLines; i++) {
            solve(sc.nextInt());
        }
    }
}
