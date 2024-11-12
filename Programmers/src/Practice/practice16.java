package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 나누어 떨어지는 숫자 배열
public class practice16 {
	public static void main(String[] args) {
		int[] answer = {};
		int[] arr = {2, 36, 1, 3};
		List<Integer> list = new ArrayList<>();
		int d = 1;
		for(int i = 0; i < arr.length; i++) {
			if((arr[i] % d) == 0) {
				list.add(arr[i]);
			}
		}
//		if(list.isEmpty()) {
//			list.add(-1);
//		}
		if(list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
			System.out.println(answer);
		}
		list.sort(null);
		System.out.println(list);
		answer = list.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(answer));
	}
}
