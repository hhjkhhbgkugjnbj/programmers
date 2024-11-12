package KAKAO_BLIND_RECRUITMENT;

// [1차] 다트 게임
public class practice2018_02 {
	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		int[] result = new int[3];
		int score = 0;
		int k = 0;
		String s = "";
		for(int i = 0; i < dartResult.length(); i++) {
			char ch = dartResult.charAt(i);
			switch (ch) {
			case 'S':
				score = Integer.parseInt(s);
				result[k++] = (int) Math.pow(score, 1);
				s = "";
				break;
			case 'D':
				score = Integer.parseInt(s);
				result[k++] = (int) Math.pow(score, 2);
				s = "";
				break;
			case 'T':
				score = Integer.parseInt(s);
				result[k++] = (int) Math.pow(score, 3);
				s = "";
				break;
			case '*':
				result[k-1] *= 2;
				if(k - 2 >= 0) result[k-2] *= 2;
				break;
			case '#':
				result[k-1] *= -1;
				break;
			default:	
				s += String.valueOf(ch);
				score = Integer.parseInt(s);
				break;
			}
		}
		System.out.println(result[0] + result[1] + result[2]);
		
//		int answer = 0; 
//		int[] game = new int[3];
//		String s = ""; // 숫자로 된 문자열
//		int n = 0; // s문자열을 숫자로 변경
//		int k = 0; // 게임을 하나씩 증가
//		for(int i = 0; i < dartResult.length(); i++) {
//			char ch = dartResult.charAt(i);
//			if(ch >= '0' && ch <= '9') {
//				s += String.valueOf(ch);
//			}else if(ch == 'S' || ch == 'D' || ch == 'T') {
//				n = Integer.parseInt(s);
//				if(ch == 'S') game[k++] = (int) Math.pow(n, 1);
//				if(ch == 'D') game[k++] = (int) Math.pow(n, 2);
//				if(ch == 'T') game[k++] = (int) Math.pow(n, 3);
//				s = "";
//			}else if(ch == '*') {
//				game[k-1] *= 2;
//				if(k-2 >= 0) game[k-2] *= 2; 
//			}else if(ch == '#') {
//				game[k-1] *= -1;
//			}
//		}
	}
}
