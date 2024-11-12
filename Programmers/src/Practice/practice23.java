package Practice;


// 문자열 겹쳐쓰기
public class practice23 {
	public static void main(String[] args) {
		String my_string = "Program29b8UYP";
		String overwrite_string = "merS123";
		int s = 7;
		String test = "";
//		test = my_string.split(Character.toString(my_string.charAt(s)))[0] + overwrite_string;
//		System.out.println(test);
		System.out.println(new StringBuilder(my_string).replace(s, s + overwrite_string.length(), overwrite_string).toString());
	}
}
