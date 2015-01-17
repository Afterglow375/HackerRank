package warmup;

import java.util.Scanner;

public class SherlockAndGCD {
    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b, a%b);
    }

    public static boolean solve(int a, int b) {
        if (a == 1)
            return true;
        if (gcd(a, b) == 1)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTestcases = sc.nextInt();

        for (int i = 0; i < numTestcases; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            boolean success = false;
            outer:
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (solve(arr[j], arr[k])) {
                        success = true;
                        break outer;
                    }
                }
            }

            if (success)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
