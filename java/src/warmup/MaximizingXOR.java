package warmup;

import java.util.Scanner;

public class MaximizingXOR {
    static int maxXor(int l, int r) {
        int max = 0;
        while (l < r) {
            for (int i = l+1; i <= r; i++) {
                int xor = (l ^ i);
                if (xor > max)
                    max = xor;
            }
            l++;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = Integer.parseInt(in.nextLine());
        int r = Integer.parseInt(in.nextLine());
        System.out.println(maxXor(l, r));
    }
}
