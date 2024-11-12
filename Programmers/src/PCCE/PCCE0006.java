package PCCE;

public class PCCE0006 {
	public static void main(String[] args) {
		int[] numbers = {1}; 
		int[] our_score = {100};
		int[] score_list = {100, 80, 90, 84, 20};
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }
        System.out.println(answer);
//        return answer;
	}
}
