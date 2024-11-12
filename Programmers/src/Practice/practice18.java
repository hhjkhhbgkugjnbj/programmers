package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 문자열 내 마음대로 정렬하기
public class practice18 {
	public static void main(String[] args) {
//		String[] str = {"sun", "bed", "car"};
//		int n = 1;
//		String[] answer = new String[str.length];
//		List<String> list = new ArrayList<>();
//		for(int i = 0; i < str.length; i++) {
//			list.add(str[i].charAt(n) + "," + str[i]);
//		}
//		System.out.println(list);
//		Collections.sort(list);
//		for(int i = 0; i < list.size(); i++) {
//			String a = list.get(i).split(",")[1];
//			answer[i] = a;
//		}
//		System.out.println(Arrays.toString(answer));
		// 한 줄? 코드
//        return Arrays.stream(strings)
//                .sorted((s1, s2) -> {
//                    int cmp = Character.compare(s1.charAt(n), s2.charAt(n));
//                    return cmp != 0 ? cmp : s1.compareTo(s2);
//                })
//                .toArray(String[]::new);
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        // 정렬하고 새로운 배열로 변환
        String[] sortedArray = Arrays.stream(strings)
                .sorted((s1, s2) -> {
                    int cmp = Character.compare(s1.charAt(n), s2.charAt(n));
                    return cmp != 0 ? cmp : s1.compareTo(s2);
                })
                .toArray(String[]::new);

        // 정렬된 배열 출력
        System.out.println(Arrays.toString(sortedArray)); // 출력: [car, bed, sun]
	}
}
