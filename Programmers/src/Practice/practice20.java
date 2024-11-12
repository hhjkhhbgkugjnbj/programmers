package Practice;
// 소수 찾기
public class practice20 {
	public static void main(String[] args) {
        int answer = 0;
        int n = 10;
        

        for(int i = 2; i <= n; i++) {
        	boolean isPrume = true;
        	for(int j = 2; j <= Math.sqrt(i); j++) {
        		if(i % j == 0) {        			
        			isPrume = false;
        			break;
        		}
        	}
        	if(isPrume) answer++;
        }
	}
}
