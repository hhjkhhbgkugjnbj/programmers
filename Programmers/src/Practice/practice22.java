package Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

// 분수의 덧셈
public class practice22 {
	public static void main(String[] args) {
		int[] answer = new int[2];
		
		int numer1 = 5;
		int denom1 = 2;
		int numer2 = 5;
		int denom2 = 2;
		
		
		answer[0] = numer1 * denom2 + numer2 * denom1;
		answer[1] = denom1 * denom2;
		
		int min = Math.min(answer[0], answer[1]);
		
		for(int i = min; i >= 2; i--) {
			if(answer[0] % i == 0 && answer[1] % i == 0) { // 만약 분자, 분모가 i로 나누어 떨어졌을 때 
				answer[0] /= i;
				answer[1] /= i;
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
        int n = numer1* denom2 + numer2 * denom1;
        int d = denom1 * denom2;
        
        int g = (int) IntStream.rangeClosed(1, Math.min(n, d)).filter(i -> n % i == 0 && d % i == 0).max().getAsInt();
        
        //return new int[] {n / g, d / g};
//
//		if(denom2 % denom1 == 0) {
//			int q = denom2 / denom1;
//			denom1 *= q;
//			numer1 *= q;
//			System.out.println(denom1 + numer1);
//			d = denom1;
//			n = numer1 + numer2;
//			System.out.println("n : " + n + " d :" + d);
//		}else if(denom1 % denom2 == 0) {
//			int q = denom1 / denom2;
//			denom2 *= q;
//			numer2 *= q;
//			System.out.println(denom2 + numer2);
//			d = denom2;
//			n = numer1 + numer2;
//			System.out.println("n : " + n + " d :" + d);
//		}else {
//			d = denom1 * denom2;
//			numer1 *= (d / denom1);
//			numer2 *= (d / denom2);
//			n = numer1 + numer2;
//			System.out.println("n : " + n + " d :" + d);
//		}
//
//		if(n % d == 0) {
//			if(numer1 + numer2 == d) {
//				n /= d;
//				d = 0;
//			}else {				
//			n /= d;
//			d /= d;
//			}
//		}
//		answer[0] = n;
//		answer[1] = d;
//		System.out.println(Arrays.toString(answer));
	}
}