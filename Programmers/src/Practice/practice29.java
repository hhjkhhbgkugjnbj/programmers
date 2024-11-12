package Practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

// 최대공약수와 최소공배수
public class practice29 {
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int n = sca.nextInt();
		int m = sca.nextInt();
//		int max = n > m ? n : m; // n과 m 중 더 큰 것 18
//		int min = n < m ? n : m;// n과 m 중 더 작은 것 12
//		int[] result = {1,n*m};
//
//		for(int i = 1; i <= min; i++) { // 1~12
//			for(int j = 1; j <= max; j++) {		//1~18	
//				if(max % i == 0 && min % i == 0) { // 만약 18, 12가 동시에 나뉘는 수가 있다면 그게 최대 공약수 없다면
//					result[0] = i; // -> 18 / 6 ==0 ??? 해결
//				}
//				if(j * min == max*i) {
//					result[1] = j * min < result[1] ? j * min : result[1];
//				}
//
//			}
//		}
//		if(result[1] == 0) {
//			result[1] = min * max;
//		}
//		System.out.println(Arrays.toString(result));
		System.out.println(IntStream.rangeClosed(1, Math.min(n, m)).filter(i -> (n % i == 0) && (m % i == 0)).max().getAsInt());
	}
}
