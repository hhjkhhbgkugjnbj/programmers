package Practice;
// 배열 회전시키기
import java.util.Arrays;

public class practice01 {
	public static void main(String[] args) {
	
	    int[] answer = {};
	    int[] numbers = {1,2,3}; // INDEX 0,1,2
	    String direction = "right";
	    

	    if(direction.equals("right")){
	        int sizeR = numbers.length; // 3
//	        System.out.println("sizeR : " + sizeR);
//	        System.out.println("numbers[2] : " + numbers[2]); // 3
//	        System.out.println("numbers[sizeR] : " + numbers[sizeR - 1]); // 3
	        int a = numbers[sizeR - 1];
	        System.out.println("a : " + a);
	        for(int i = sizeR-1; i > 0; i--){
//		        System.out.println("numbers[i] : " + numbers[i]); // 3
//		        System.out.println("numbers[] : " + numbers[sizeR - 1]); // 3
	            numbers[i] = numbers[i-1];
	        }
//	        System.out.println("a : " + a);
	        numbers[0] = a;
//	        System.out.println("numbers[0] : " + numbers[0]); // 3
//	        System.out.println("numbers[1] : " + numbers[1]); // 1
//	        System.out.println("numbers[2] : " + numbers[2]); // 2
//	        System.out.println("numbers" + numbers);
	        answer = numbers;
	        System.out.println("answer" + answer);
//	        return answer;
	    }else{ //left
	    	int sizeL = numbers.length; // 3
	        int b = numbers[0];
	        System.out.println("b : " + b);
	        for(int i = 1; i < sizeL; i++){
	            numbers[i-1] = numbers[i];
	        }
	        numbers[sizeL-1] = b;
	        answer = numbers;
	        System.out.println("answer : " + Arrays.toString(answer));
//	        return answer;
	    }
	}
}

