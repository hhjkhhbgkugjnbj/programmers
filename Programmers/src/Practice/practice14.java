package Practice;

// 가운데 글자 가져오기
public class practice14 {
	public static void main(String[] args) {
		String s = "qwer";
		System.out.println((s.length() % 2 == 1) ? s.charAt(s.length() / 2)
				: String.valueOf(s.charAt(s.length() / 2 - 1)) + s.charAt(s.length() / 2));

	}
}
