package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 달리기 경주
public class practice31 {
	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}
		
		for(String calling : callings) {
			int index = map.get(calling);
			
			if(index > 0) {
				String fP = players[index - 1];
				players[index - 1] = players[index];
				players[index] = fP;
				
				map.put(calling, index - 1);
				map.put(fP, index);
			}
		}
		
		System.out.println(Arrays.toString(players));
		
	}
}
