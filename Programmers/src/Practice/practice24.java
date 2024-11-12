package Practice;
// 코드 처리하기
public class practice24 {
	public static void main(String[] args) {
		String code = "1";
		int mode = 0;
		StringBuilder result = new StringBuilder();
		
//		for(int i = 0; i < code.length(); i++) {
//			if(mode == 0) { // mode가 0일때
//				if(code.charAt(i) == '1') {
//					mode = 1;
//				}else {
//					if(i % 2 == 0) { // i가 2로 나누어 떨어질 때만
//						result.append(code.charAt(i));
//					}
//				}
//			}else if(mode == 1) { // mode가 1일때
//				if(code.charAt(i) == '1') {
//					mode = 0;
//				}else {
//					if(i % 2 != 0) {
//						result.append(code.charAt(i));
//					}
//				}
//			}
//		}
//		
//		if(result.length() == 0) {
//			//return "EMPTY";
//			System.out.println("EMPTY");
//		}
//		System.out.println(result);
		System.out.println(new StringBuilder(code));
	}
}
