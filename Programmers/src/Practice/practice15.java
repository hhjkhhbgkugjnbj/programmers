package Practice;

import java.util.Stack;

// 같은 숫자는 싫어
public class practice15 {
	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
        int[] answer = {};
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		for(int arrs : arr) {
//			System.out.println(arrs);
			if(stack.peek() == arrs) {
				continue;
			}else {	
				stack.add(arrs);
			}
		}
	
		System.out.println(stack.toString());
	}
}
