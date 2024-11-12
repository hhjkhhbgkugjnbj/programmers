package Practice;

import java.util.Scanner;

// 저주의 숫자 3
// 테스트 4, 5 실패
public class Practice09 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int stack = 0; // 0스택
//		System.out.println(26 % 3);
//		for (int i = 1; i < n + 1; i++) { // 1부터 15까지
//			int answer = i + stack; // 더할
//			while (true) { // 만약 결과가 3의 배수거나 3이 포함이면 스택 + 1
//				if(answer % 3 == 0 || answer % 10 == 3 || answer / 10 == 3 || answer / 10 == 13) {
////					System.out.printf("%d % 3 = 0", answer);
////					System.out.println();
//					stack++;
//					answer++;
//					System.out.println("+");
//				}else {
//					break;
//				}
//			}
//			System.out.printf("%d + %d =  %d", i , stack , answer);
//			System.out.println();
//		}
//		int result = stack + n;
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			answer++;
//			while(answer % 3 == 0 || answer % 10 == 3 || answer / 10 % 10 == 3)
//			while(answer % 3 == 0 || String.valueOf(answer).indexOf("3"))
			while(answer % 3 == 0 || String.valueOf(answer).contains("3"))
				answer++;
		}
		System.out.println(answer);
	}
}
