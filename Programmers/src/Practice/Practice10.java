package Practice;

import java.util.Scanner;

// 프로그래머스 369게임
public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for(char c : String.valueOf(n).toCharArray()) {
//			System.out.println(c);
			if(c == '3' || c == '6' || c == '9') answer++;
		}
		System.out.println(answer);
	}
}
