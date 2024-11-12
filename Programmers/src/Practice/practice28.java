package Practice;
// 자연수 뒤집어 배열로 만들기
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class practice28 {
	public static void main(String[] args) {
		long[] n = {1,2,3,4,5};
//		List<Integer> list = new ArrayList<>();
//		
//		for(int i = n.length-1; i >= 0; i--) {
//			list.add((int) n[i]);
//		}
//		System.out.println(Arrays.toString(list.toArray()));
//		
//		System.out.println(Arrays.toString(IntStream.rangeClosed(1,n.length).map(i -> (int)n[n.length-i]).boxed().toArray()));
//		System.out.println(new StringBuilder(String.valueOf(n)).reverse().toString().chars().map(c -> c - '0').toArray());
		// 학원
		String s = String.valueOf(n);
		int[] answer = new int[s.length()];
		int k = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			answer[k++] = Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		System.out.println(answer);
		// ???????????? 왜 안돼.
		

	}
}
