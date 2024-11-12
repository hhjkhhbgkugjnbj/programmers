package PCCE;
// PCCE 기출문제 5번 / 산책
public class PCCE0005 {
	public static void main(String[] args) {
		String route = "NSSNEWWN";
		int east = 0;
		int north = 0;
		int[] answer = new int[2];
		for (int i = 0; i < route.length(); i++) {
			switch (route.charAt(i)) {
			case 'N':
				north++;
				break;
			case 'S':

				north--;
				break;
			case 'E':

				east++;
				break;
			case 'W':

				east--;

				break;
			}
		}
		answer[0] = east;
		answer[1] = north;
		System.out.println(answer);
	}
}
