package KAKAO_BLIND_RECRUITMENT_2018;
// [1차] 비밀지도
public class practice01 {
	public static void main(String[] args) {
//		int n = 5;
//		int[] arr1 = {9, 20, 28, 18, 11};
//		int[] arr2 = {30, 1, 21, 17, 28};
		
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		String[] arr3 = new String[n];
		for(int i = 0; i < n; i++) {
			arr3[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i])).replace(" ", "0");
			arr3[i] = arr3[i].replace("1", "#").replace("0", " ");
		}
		
	}
}
