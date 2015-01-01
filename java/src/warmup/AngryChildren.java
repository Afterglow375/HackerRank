package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AngryChildren {
    static int minUnfairness(int[] packets, int numKids) {
        Arrays.sort(packets);
        int minUnfairness = Integer.MAX_VALUE;
        for (int i = 0; i + numKids <= packets.length; i++) {
            int unfairness = packets[i + numKids - 1] - packets[i];
            if (unfairness < minUnfairness)
                minUnfairness = unfairness;
        }
        return minUnfairness;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int numPackets = Integer.parseInt(br.readLine()); // 1 <= numLines <= 10^5
            int numKids = Integer.parseInt(br.readLine()); // 1 <= numLines <= 10^5
            int[] packets = new int[numPackets];
            for (int i = 0; i < numPackets; i++) {
                int packet = Integer.parseInt(br.readLine());
                packets[i] = packet;
            }

            System.out.println(minUnfairness(packets, numKids));
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
