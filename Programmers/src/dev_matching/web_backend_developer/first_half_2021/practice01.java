package dev_matching.web_backend_developer.first_half_2021;

import java.util.Arrays;
import java.util.stream.IntStream;

// 로또의 최고 순위와 최저 순위
public class practice01 {
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		//int[] answer = {6,6};
		//int k = 0;
		//answer[0] = IntStream.rangeClosed(0, lottos.length - 1).forEach(i -> {IntStream.rangeClosed(0, win_nums.length - 1).forEach(j -> lottos[i] == win_nums[j] ));
//		for(int i = 0; i < lottos.length; i++) {
//			for(int j = 0; j < win_nums.length; j++) {
//				if(lottos[i] == win_nums[j]) {
//					System.out.println("lottos[i] :" + lottos[i] + " win : " + win_nums[j]);
//					lottos[i] = -1;
//					win_nums[j] = -2;
//					k++; // 만약 존재하면 당청 개수 +
//
//					System.out.println("k : " + k);
//					
//					answer[1] = k > 1 ? answer[1] - 1 : answer[1];
//					answer[0] = k > 1 ? answer[0] - 1 : answer[0];
//				}
//			}
//		}
//		System.out.println("--------------");
//		for(int i = 0; i < lottos.length; i++) {
//			for(int j = 0; j < win_nums.length; j++) {
//				if(lottos[i] == 0 && win_nums[j] != -2) {
//					lottos[i] = -1;
//					k++; // 만약 존재하면 당청 개수 +
//					answer[0] = k > 1 ? answer[0] - 1 : answer[0];
//					System.out.println("k : " + k);
//					System.out.println("answer[0] : " + answer[0]);
//					System.out.println("lottos[i] :" + lottos[i] + " win : " + win_nums[j]);
//				}
//			}
//		}
//		int k = (int)IntStream.of(lottos).filter(lotto -> lotto != 0 && IntStream.of(win_nums).anyMatch(win -> win == lotto)).count();
//		int z = (int) IntStream.of(lottos).filter(lotto -> lotto == 0).count();
//		System.out.println(Arrays.toString(answer));
//		System.out.println(k);
//		System.out.println(z);
		//System.out.println(Arrays.toString(new int[]{Math.min(6,7-((int) IntStream.of(lottos).filter(lotto -> lotto != 0 && IntStream.of(win_nums).anyMatch(win -> win == lotto)).count()+(int) IntStream.of(lottos).filter(lotto -> lotto == 0).count())), Math.min(6,7-(int) IntStream.of(lottos).filter(lotto -> lotto == 0).count())}));

		int[] answer = new int[2];
		int[] rank = {6,6,5,4,3,2,1};
		
		for(int i = 0; i < lottos.length; i++) {
			if(lottos[i] == 0) {
				answer[0]++;
				continue;
			}
			for(int j = 0; j < win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) {
					answer[0]++;
					answer[1]++;
				}
			}
		}
		answer[0] = rank[answer[0]];
		answer[1] = rank[answer[1]];
		System.out.println(Arrays.toString(answer));
	}
}
