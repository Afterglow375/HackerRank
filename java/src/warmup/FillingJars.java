package warmup;

import java.util.Scanner;

public class FillingJars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int operations = sc.nextInt();

        long sum = 0;
        for (int i = 0; i < operations; i++) {
            int lo = sc.nextInt();
            int hi = sc.nextInt();
            sum += (long) (hi - lo + 1) * sc.nextInt();
        }

        System.out.println((long) sum/N);
    }
}
