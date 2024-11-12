package Practice;
// 최댓값 구하기 (2)
public class practice07 {
	public static void main(String[] args) {
//		int[] numbers = {1, 2, -3, 4, -5};
//		int[] numbers = {10, 20, 30, 5, 5, 20, 5};
		int[] numbers = {-1,2};
//		int answer = 0;
//		int max = -10000 * 10000;
//		System.out.println(numbers.length);
//		for(int i = 0; i < numbers.length; i++) {	// 0 ~ 5 -> 4번
//			for(int j = numbers.length - 1; j > i; j--) {	// 5 ~ 
//				System.out.println("numbers[" + i + "] : " + numbers[i]);
//				System.out.println("numbers[" + j + "] : " + numbers[j]);
//				max = max >= numbers[i] * numbers[j] ? max : numbers[i] * numbers[j];
//			}
//		}
//		System.out.println(max);
		int answer = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				answer = Math.max(answer, numbers[i] * numbers[j]);
			}
		}
		System.out.println(answer);
	
	}
}
