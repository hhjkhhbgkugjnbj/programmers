package Monthly_Code_Challenge_Season_1;

// 3진법 뒤집기
public class practice02 {
	public static void main(String[] args) {
		int n = 45;
		int result = 0;
		
		String a = Integer.toString(n,3);
		String b = "";
		
		for(int i = Integer.toString(n, 3).length() - 1; i >= 0; i--) {
			b += Integer.toString(n, 3).charAt(i);
		}
		result = Integer.parseInt(b,3);
		System.out.println(result);
//		System.out.println(new StringBuilder(Integer.toString(n, 3)).reverse().toString());
//		System.out.println(Integer.parseInt(new StringBuilder(Integer.toString(n, 3)).reverse().toString(),3));
//		System.out.println(Integer.toString(Integer.parseInt(new StringBuilder(Integer.toString(n, 3)).reverse().toString()),3));
	}
}
