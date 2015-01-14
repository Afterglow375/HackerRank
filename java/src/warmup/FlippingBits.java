package warmup;

import java.util.Scanner;

public class FlippingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numLines = sc.nextLong();
        long mask = 4294967295L; // Max unsigned 32-bit value
        for (int i = 0; i < numLines; i++) {
            System.out.println(mask ^ sc.nextLong());
        }
    }
}
