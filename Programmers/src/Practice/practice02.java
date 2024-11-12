package Practice;
// 최댓값 만들기 (1)
public class practice02 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,5};
//		int[] numbers = {0, 31, 24, 10, 1, 9};
        int answer = 0;
        int j = 0;
        int h = 0;
        int size = numbers.length; // 5
        for(int i = 0; i < size; i++){ // 0 ~ 4
            if(j < numbers[i]){
                j = numbers[i]; // 가장 큰 수 j 
            }else if(j == numbers[i]) {
            	h = numbers[i];
            }
        }
        for(int s = 0; s < size; s++){
            if(numbers[s] < j)
            	if(h < numbers[s]){
                h = numbers[s];
            }
        }
        answer = h * j;
        System.out.println("answer : " + answer);
	}
}
