package Practice;

import java.util.stream.IntStream;
// 약수의 합
public class practice27 {
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += n % i == 0 ? i : 0;
		}
		
		System.out.println(IntStream.rangeClosed(1, n).filter(i->n % i == 0).sum());
		System.out.println(sum);
	}
}
