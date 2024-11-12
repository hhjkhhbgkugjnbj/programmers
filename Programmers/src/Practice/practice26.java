package Practice;
// 시저 암호
public class practice26 {
	public static void main(String[] args) {
		//String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s = "a B z";
		StringBuilder stb = new StringBuilder(); // 공백을 1로 변경
		int n = 25;
		for(int i = 0; i < s.length(); i++) {
			int a = s.charAt(i);
			System.out.println(a);
			// 만약 기존 a가 65 ~ 90 사이이고 a+n이 90이상이라면
			if((65 <= a && a <= 90)) {
				a += n;
				if(a > 90) {		
					stb.append((char)(a -= 26));
				}else {
					stb.append((char)(a));
				}
			}
			if((97 <= a && a <= 122)) {
				a += n;
				if(a > 122) {
					stb.append((char)(a -= 26));
				}else {
					stb.append((char)(a));
				}
			}
            if(a == 32) {
				stb.append(" ");
			}
			
		}
		System.out.println(stb.toString());
	}
}
