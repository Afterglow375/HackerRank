package warmup;

import java.util.Scanner;

public class ChocolateFeast {
    public static long solve(int money, int cost, int wrappersCost) {
        long chocolates = money / cost;
        long wrappers = chocolates / wrappersCost;
        long wrappersLeft = chocolates % wrappersCost;
        chocolates += wrappers;

        while (wrappers + wrappersLeft >= wrappersCost) {
            long oldWrappers = wrappers;
            wrappers = (wrappers + wrappersLeft) / wrappersCost;
            wrappersLeft = (oldWrappers + wrappersLeft) % wrappersCost;
            chocolates += wrappers;
        }

        return chocolates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();

        for (int i = 0; i < numLines; i++) {
            System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }
}
