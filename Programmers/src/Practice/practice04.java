package Practice;
// 캐릭터 좌표
import java.util.Arrays;
import java.util.Iterator;

public class practice04 {
	public static void main(String[] args) {
	    int[] answer = {0, 0};
	    String[] keyinput = {"down", "down", "down", "down", "down"};
	    int[] board = {7, 9};
	    
        int left = -(board[0] / 2);
        int right = board[0] / 2; // 4
        int up = board[1] / 2;
        int down = -(board[1] / 2);
        
	    int x = 0; 
        int y = 0;
        
        for(String s : keyinput){
            if(s == "left"){
                x--;
                if(x < left) x = left; 
            }else if(s == "right"){
                x++;
                if(x > left) x = right; 
            }else if(s == "up"){
                y++;
                if(y > up) y = up; 
            }else if(s == "down"){
                y--;	
                if(y < down) y = down;
                System.out.println(y);
                System.out.println("down : " + down);
            }
            
        }
        System.out.println("7(board[0]) / 2 : " + (board[0]) / 2);
        System.out.println("9(board[1]) / 2 : " + (board[1]) / 2);
        System.out.println("7(board[1]) / 2 : " + (-1 * board[0]) / 2);
        System.out.println("9(board[1]) / 2 : " + (-1 * board[1]) / 2);
        System.out.println("y: " + y);
       
        
        System.out.println(x);
        System.out.println(y);
        answer[0] = x;
        answer[1] = y;
        System.out.println(Arrays.toString(answer));
	    }
	}
