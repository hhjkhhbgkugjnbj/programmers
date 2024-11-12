package Practice;
// 2016년
import java.time.LocalDate;
import java.util.Scanner;

public class practice13 {
	public static void main(String[] args) {
		String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
//		System.out.println(week[LocalDate.of(2016, a, b).getDayOfWeek().getValue()]);
		// 그냥 요일별 앞 3개만 가져오기 (한 줄 코드)
		System.out.println(LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3).toUpperCase());
		
	}
}
