package kakao.internship.recruitment2021;
// 숫자 문자열과 영단어
public class practice01 {
	public static void main(String[] args) {
		String s = "one4seveneight";
		String[] ss = {"zero","one", "two", "three", "four", "five", "six","seven","eight","nine"};
		
		for(int i = 0; i < ss.length; i++) {
			s= s.replace(ss[i], String.valueOf(i));
		}
		
		System.out.println(Integer.parseInt(s));
	}
}
