package PCCE;

// [PCCP 기출문제] 1번 / 동영상 재생기
public class PCCE0101 {
	public static void main(String[] args) {
		String[] p1 = {"next", "prev"};
		String[] p2 = {"prev", "next", "next"};
		String[] p3 = {"next"};
		
		System.out.println(solution("34:33","13:00","00:55","02:55",p1));
		System.out.println(solution("10:55","00:05","00:15","06:55",p2));
		System.out.println(solution("07:22","04:05","00:15","04:07",p3));
	}
	
    static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        for(int i = 0 ; i < commands.length; i++) {
        	char c = commands[i].charAt(0);
        	System.out.println("pos : " + pos);
        	if(Integer.parseInt(pos.replace(":", "")) <= Integer.parseInt(op_end.replace(":", "")) && Integer.parseInt(pos.replace(":", "")) >= Integer.parseInt(op_start.replace(":", ""))){
        		pos = op_end;
        	}
        	int hour = Integer.parseInt(pos.split(":")[0]);
        	int minute = Integer.parseInt(pos.split(":")[1]);
        	switch(c) {
        	case 'n': // 만약 p가 나왔는데 pos가 00분 05초면 00분 00초로 이동, pos가 16분 05초면 15분 55초로 이동.
        		minute += 10;
        		if(minute >= 60) {
        			minute -= 60;
        			hour += 1;
        		}
        		
        		String minute2 = String.valueOf(minute);
        		if(minute < 10) {
        			minute2 = "0" + String.valueOf(minute);
        		}
        		String a = String.valueOf(hour) + ":" + String.valueOf(minute);
        		pos = a;
            	if(Integer.parseInt(pos.replace(":", "")) <= Integer.parseInt(op_end.replace(":", "")) && Integer.parseInt(pos.replace(":", "")) >= Integer.parseInt(op_start.replace(":", ""))){
            		pos = op_end;
            	}
        		break;
        	case 'p':
        		minute -= 10;
        		if(minute < 00) {
        			minute += 60;
        			hour -= 1;
        		}
        		if(hour < 0) {
        			hour = 0;
        			minute = 0;
        		}
        		String hour2 = String.valueOf(hour);
        		if(hour < 10) {
        			hour2 = "0" + String.valueOf(hour);
        		}
        		String minute3 = String.valueOf(minute);
        		if(minute < 10) {
        			minute3 = "0" + String.valueOf(minute);
        		}
        		String b = hour2 + ":" + minute3;
        		pos = b;
            	if(Integer.parseInt(pos.replace(":", "")) <= Integer.parseInt(op_end.replace(":", "")) && Integer.parseInt(pos.replace(":", "")) >= Integer.parseInt(op_start.replace(":", ""))){
            		pos = op_end;
            	}
        		break;
        	}
    		String checkHour = String.valueOf(hour);
    		if(hour < 10) {
    			checkHour = "0" + String.valueOf(hour);
    		}
    		String checkMinute = String.valueOf(minute);
    		if(minute < 10) {
    			checkMinute = "0" + String.valueOf(minute);
    		}
    		String check = checkHour + ":" + checkMinute;
    		pos = check;
        	
        }
        answer = pos;
        return answer;
    }
    
}
