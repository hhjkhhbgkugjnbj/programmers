package Practice;
// 컨트롤 제트
public class Practice05 {
	public static void main(String[] args) {
//		String s = "-1 -2 -3 Z";
//		int sum = Integer.parseInt(s.split(" ")[0]);	// 맨 처음은 절대 Z가 아님.
//		int sL = s.split(" ").length;
//		int i = 1;
//
//		while(sL > 1) { 								// 4 3 2 까지 3번 돌아야함.
//			if(s.split(" ")[i].equals("Z")) {
//					sum = sum - Integer.parseInt(s.split(" ")[i-1]); 
//			}else {
//				sum += Integer.parseInt(s.split(" ")[i]);
//			}
//			i++;
//			sL--;
//		}
//		System.out.println(sum);
		
		String s = "-1 -2 -3 Z";
		int sum = Integer.parseInt(s.split(" ")[0]);	// 맨 처음은 절대 Z가 아님.
		int sL = s.split(" ").length;
		int i = 1;

		for (int j = sL; j > 1; j--) { // 4 3 2 까지 3번 돌아야함.
			if (s.split(" ")[i].equals("Z")) {
				sum = sum - Integer.parseInt(s.split(" ")[i - 1]);
			} else {
				sum += Integer.parseInt(s.split(" ")[i]);
			}
			i++;

		}
		System.out.println(sum);
		
	}
}
