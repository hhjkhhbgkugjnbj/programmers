package Practice;
// 옹알이 (1)
public class practice25 {
	public static void main(String[] args) {
		String[] babySay = {"aya", "ye", "woo", "ma"};
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		
		int stack = 0;
		for(String bab : babbling) {
			for(String say : babySay) { // 한 babbling 단어당 babySay가 다 지나가야함.
				if(bab.contains(say)) { // 만약 들어있다면
					bab = bab.replaceAll(say, ","); // 제거 제거 했을때 비어있다면  +1
					if(bab.replaceAll(",", "").isEmpty()) stack++;		
				}
			}
		}
		System.out.println(stack);
	}
}
