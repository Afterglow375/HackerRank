package warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class ACM_ICPCTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt(); // M will be unused
        BigInteger[] people = new BigInteger[N];
        int maxSubject = 0;
        int numTeams = 0;
        for (int i = 0; i < N; i++) {
            BigInteger bi = new BigInteger(sc.next(), 2);
            for (int j = 0; j < i; j++) {
                BigInteger or = bi.or(people[j]);

                // Count the ones and compare to our current max
                int onesCount = 0;
                for (int k = 0; k < M; k++) {
                    if (or.testBit(k))
                        onesCount++;
                }
                if (onesCount > maxSubject) {
                    maxSubject = onesCount;
                    numTeams = 1;
                }
                else if (onesCount == maxSubject)
                    numTeams++;
            }

            people[i] = bi;
        }

        System.out.println(maxSubject);
        System.out.println(numTeams);
    }
}
