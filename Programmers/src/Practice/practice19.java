package Practice;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
public class practice19 {
	public static void main(String[] args) {
		String answer = "";
		String s = "Zbcdefg";
//		
//		char[] charArray = s.toCharArray();
//		Arrays.sort(charArray);
//		
//		StringBuilder stb = new StringBuilder(new String(charArray)).reverse();
//		System.out.println(stb.toString());
//		
		
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		for(int i = arr.length - 1; i >= 0; i--) {
			answer += arr[i];
		}
		System.out.println(answer);
	}
}
