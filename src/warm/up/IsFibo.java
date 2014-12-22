package warm.up;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// A number is in the Fibonacci sequence if one or both of (5*n^2 + 4) or (5*n^2 - 4) is a perfect square

public class IsFibo {
	public static BigInteger sqrt(BigInteger x) {
	    BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
	    BigInteger div2 = div;
	    // Loop until we hit the same value twice in a row, or wind up alternating
	    for(;;) {
	        BigInteger y = div.add(x.divide(div)).shiftRight(1);
	        if (y.equals(div) || y.equals(div2))
	            return y;
	        div2 = div;
	        div = y;
	    }
	}
	
	public static boolean isPerfectSquare(BigInteger n) {
		BigInteger sqrt = sqrt(n);
		return (sqrt.multiply(sqrt).equals(n));
	}
	
	public static void isFibo(BigInteger n) {
		if (n.signum() == -1) { // if the input is negative
			System.out.println("IsNotFibo");
			return;
		}
		
		BigInteger val = n.multiply(n).multiply(BigInteger.valueOf(5));
		if (isPerfectSquare(val.add(BigInteger.valueOf(4))) || isPerfectSquare(val.subtract(BigInteger.valueOf(4)))) 
			System.out.println("IsFibo");
		else 
			System.out.println("IsNotFibo");
	}
	
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        	int numLines = Integer.parseInt(br.readLine()); // 1 <= numLines <= 10^5
        	for (int i = 0; i < numLines; i++) {
        		long num = Long.parseLong(br.readLine());
        		BigInteger bigNum = BigInteger.valueOf(num);
        		isFibo(bigNum);
        	}
			br.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}