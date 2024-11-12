package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice11 {
	public static void main(String[] args) {
//		int[] arr = {3,1,2,3};
//		int n = arr.length / 2; // 선택 가능한 마릿수
//		System.out.println(n);
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // 맵 선언
//		// 만약 map안에 arr의 값이 있을 때 arr의 값을 map안에서 찾아서 그 값의 키를 똑같이 부여.
//		int num = 0;
//		int cnt = 0;
//		for(int i = 0; i < arr.length; i++) { // 0~5 -> 6번
//			// i 로 인덱스 구분 num은 개수 증가용
//			if(map.containsKey(arr[i])) { // 만약 map안에 arr[i]를 포함한다면
//				System.out.println("num : " + num);
//				System.out.println("arr[num] : " + arr[num]);
//				map.put(arr[i], map.get(arr[i])+1); // map에 arr[i]을 키로 arr[i]의 인덱스? 를 반환
//				System.out.println("get(arr[num]) : " + map.get(arr[num]));
//				System.out.println("contain : " + arr[num]);
//				num++;
//			}else {
//				num = 0; // map에 없는 수 일때 개수 초기화해야함
//				System.out.println("num 초기화");
//				map.put(arr[i], num+1);
//				System.out.println(num+1 + "만큼" + arr[num] + "추가");
//				cnt++;
//			}
//			// 다른 숫자일 떄마다 + 1
//			// 만약 가능한 마릿수를 넘기면 break하며 최대 마릿수로 끝 
//			System.out.println(map.toString());
//			System.out.println(cnt);
//		}
//		if(cnt > n) {
//			cnt = n;
//		}
//		System.out.println("cnt : " + cnt);
		// ------------------------------------------------
//		int[] arr = {3,1,2,3};
//		int n = arr.length / 2;
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		int num = 0, cnt = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(map.containsKey(arr[i])) {
//				map.put(arr[i], map.get(arr[i])+1);
//				num++;
//			}else {
//				num = 0;
//				map.put(arr[i], num+1);
//				cnt++;
//			}
//		}
//		
//		if(cnt > n) {
//			cnt = n;
//		}
//		System.out.println("cnt : " + cnt);
		// ------------------------------------------------
		int[] nums = {3,1,2,3};
		int n = nums.length / 2;
		int answer = 0;

		Set<Integer> set = new HashSet<>();
		for(int num : nums) {
			set.add(num);
		}
		// set은 중복 없음.
		System.out.println(set.size() > n ? n : set.size());
//		return set.size() > n ? n : set.size();
	}
}
