package Practice;
// 두 정수 사이의 합
public class practice17 {
	public static void main(String[] args) {
        long answer = 0;
        int a = 5;
        int b = 3;
        long min = 0, max = 0;
        // 1
        min = a < b ? a : b;
        max = a > b ? a : b;
        // 2
        min = Math.min(a,b);
        max = Math.max(a,b);
        for(long i = min; i <= max; i++) answer += i; // answer = Long.sum(answer,i);
        System.out.println(answer);
        //return answer;
	}
}
