package Practice;

import java.util.HashSet;
import java.util.Stack;

// 프로그래머스 외계어 사전
public class Practice08 {
	public static void main(String[] args) {
//		String[] spell = { "p", "o", "s" };
		String[] spell = {"z", "d", "x"};
//		String[] dic = { "sod", "eocd", "qixm", "adio", "soo" };
		String[] dic = {"def", "dww", "dzx", "loveaw"};

		HashSet<String> hs = new HashSet<>();
		Stack<String> stack = new Stack<>();
		// 걸러내기
		for (int i = 0; i < dic.length; i++) {
			int sum = 0;
			for (int j = 0; j < spell.length; j++) {
				if (dic[i].contains(spell[j])) {
					sum++;
					if(sum == spell.length) {
						stack.push(dic[i]);
					}
				}else continue;
			}
		}
		System.out.println(stack.toString());
		if(stack.isEmpty()) System.out.println(2);
		else System.out.println(1);
	}
}


