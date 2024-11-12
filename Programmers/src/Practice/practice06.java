package Practice;
// 삼각형의 완성조건 (2)
import java.util.Arrays;

public class practice06 {
	public static void main(String[] args) {
		int[] sides = {1,2};
		int answer = 0;
		int max = 0;
		int min = 0;
		// 1
		max = sides[0] > sides[1] ? sides[0] : sides[1];
		min = sides[0] < sides[1] ? sides[0] : sides[1];
		// 2
		Arrays.sort(sides);
		max = sides[1];
		min = sides[0];
		
		answer = (max + min) - (max - min) - 1;
		System.out.println(answer);
	}
}
