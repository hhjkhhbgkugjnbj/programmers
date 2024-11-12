package KAKAO_BLIND_RECRUITMENT_2021;
// 신규 아이디 추천
public class practice01 {
	public static void main(String[] args) {
		String new_id = "z-+.^.";
//		// 문자열 소문자화
//		new_id = new_id.toLowerCase();
//		// 문자열에서 @, #, * 제거
//		new_id = new_id.replaceAll("[^[a-z0-9-_.]]", "");
//		System.out.println(new_id);
//		// 문자열에서 .., ... 을 .으로 변경
//		new_id = new_id.replaceAll("[.]{2,}", ".");
//		System.out.println(new_id);
//		// 문자열에서 처음이나 끝에 . 제거
//		new_id = new_id.replaceAll("^[.]+|[.]+$", "");
//		System.out.println(new_id);
//		// 공백일 시 a로 변환
//		new_id = new_id.replaceAll("^\\s$", "a");
//		System.out.println(new_id);
//		// 아이디 길이가 16자 이상일 시 15자까지
//		new_id = new_id.replaceAll("^(.{15}).*", "$1");
//		System.out.println(new_id);
//		new_id = new_id.replaceAll("[.]$", "");
//		System.out.println(new_id);
//		while(new_id.length() < 3) {
//			new_id = new_id.replaceAll("^(.*)$", "$1" + new_id.charAt(new_id.length() - 1));
//		}
		String answer = "";
		answer = new_id.toLowerCase();
		
		answer = answer.replaceAll("[^a-z0-9\\-\\_\\.]", "");
		
		while(answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
		
		//answer = answer.replaceAll("[\\.]{}", ".");
		// {n}, {m,n}, {m,}
		
//		if(answer.startsWith(".")) {
//			answer = answer.substring(1);
//		}
//		if(answer.endsWith(".")) {
//			answer = answer.substring(0, answer.length() - 1)
//		}
		
		answer = answer.replaceAll("^[\\.]", "");
		
		// 5
		if(answer.length() == 0) {
			answer = "a";
		}
		
		// 6
		if(answer.length() >= 16) {
			answer = answer.substring(0,15);
			answer = answer.replaceAll("[\\.]$", "");
		}
		
		//7
		if(answer.length() <= 2) {
			String l = String.valueOf(answer.charAt(answer.length() - 1));
			while(answer.length() <= 2) {
				answer += l;
			}
		}
		
	}
}
