package Monthly_Code_Challenge_Season_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// 두 개 뽑아서 더하기
public class practice01 {
	public static void main(String[] args) {
//		int[] numbers = {2,1,3,4,1};
		int[] numbers = {0,100,1000,10};
		
//		Set<Integer> set = new TreeSet();
//		
//		for(int i = 0; i < numbers.length; i++) {
//			for(int j = i+1; j < numbers.length; j++) {
//				set.add(numbers[i] + numbers[j]);
//				System.out.println(" n : " + numbers[i] + "numbers[j] : " + numbers[j] +  " = " + (numbers[i]+numbers[j]));
//			}
//		}
//		int[] result = new int[set.size()];
//		int num = 0;
//		for(int k : set) {
//			result[num++] = k;
//		}
//		System.out.println(Arrays.toString(result));
		// 간결 코드
		int[] answer = {}; 
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		answer = set.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(answer);
	}
}
