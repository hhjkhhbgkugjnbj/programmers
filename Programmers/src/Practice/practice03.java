package Practice;
// 모음 제거
public class practice03 {
	public static void main(String[] args) {
		   String answer = "";
		   String my_string = "bus";
		   for(int i = 0; i < my_string.length(); i++) {
			   char ch = my_string.charAt(i);
			   if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				   answer += String.valueOf(ch);
			   }
		   }
		   
		   
		   System.out.println(answer.replaceAll("[ieou]", " "));
		   
	}
}
