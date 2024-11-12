package Kakao_Developer_Winter_Internship;

import java.util.Arrays;
import java.util.Stack;

// 크레인 인형뽑기 게임
public class practice2019_01 {
	public static void main(String[] args) {
//		// 2차원 공간 배열 board 맨 위 -> 맨 아래 층
//		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//		
//		// 집게 배열
//		int[] move = {1,5,3,5,1,2,1,4};
		
//		Stack<Integer> stack = new Stack<>();
//		System.out.println(move.length);
//		System.out.println(move[1]);
//		System.out.println(board[move[1]-1][1]);
//		int k = 0;
//		for(int i = 0; i < move.length; i++) { // 0 ~ 7번
//			System.out.println("i : " + i);
//			for(int j = 0; j < board.length; j++) {
//				int item = board[j][move[i]-1];
//				if(item == 0) continue;
//				board[j][move[i]-1] = 0;
//				if(!stack.empty() && stack.peek() == item) {
//					stack.pop();
//					k += 2;
//				}else {
//					stack.add(item);
//				}
//				break;
//				
////				if(board[j][move[i]-1] == 0) {
////					//System.out.println("board의 " + j + "번째 층의 " + (move[i]-1) + "번째 칸은 0");
////					continue;
////				}else {
////					// 만약 보드 안에 존재하면 빈 스택에 옮기고 이후
////					// if -> 기본 추가
////					if(stack.empty()) {
////						System.out.println(j + "번째 칸에서 " + (move[i]-1) + "번째 수 " + board[j][move[i]-1] + "를 스택에 추가");
////						stack.add(board[j][move[i]-1]);
////						board[j][move[i]-1] = 0;
////						//System.out.println(Arrays.toString(board[move[i]-1]));
////						System.out.println(stack.toString());
////						break;
////					}
////					else if(stack.peek() == board[j][move[i]-1]) { // 만약 피크 보드 값 같으면 0으로 변경
////						stack.pop(); // 맨 위 스택 제거
////						board[j][move[i]-1] = 0;
////						k += 2;
////						System.out.println("k++");
////						break;
////					}
////					else{			// 아니라면 추가
////						System.out.println(j + "번째 칸에서 " + (move[i]-1) + "번째 수 " + board[j][move[i]-1] + "를 스택에 추가");
////						stack.add(board[j][move[i]-1]);
////						board[j][move[i]-1] = 0;
////						//System.out.println(Arrays.toString(board[move[i]-1]));
////						System.out.println(stack.toString());
////						break;
////					}
//////					System.out.println(j + "번째 칸에서 " + (move[i]-1) + "번째 수 " + board[j][move[i]-1] + "를 스택에 추가");
//////					System.out.println("stack에 " + board[j][move[i]-1] + "추가");
////////					stack.add(board[j][move[i]-1]);
////////					board[j][move[i]-1] = 0;
//////					System.out.println(Arrays.toString(board[move[i]-1]));
//////					System.out.println("stack : " + stack.toString());
////				}
//			}
//		}
//		System.out.println(k);
//		System.out.println(Arrays.toString(stack.toArray()));
		
		// 다른 코드
		
		// 2차원 공간 배열 board 맨 위 -> 맨 아래 층
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		
		// 집게 배열
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int answer = 0;
		// 바구니 stack
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		// 이중 for문
		for(int i : moves) {//(int i = 0; i < moves.length; i++) moves[i]
			for(int j = 0; j < board.length; j++) {
				if(board[j][i - 1] != 0) {
					if(stack.peek() == board[j][i - 1]) {
						stack.pop();
						answer += 2;
					}else {
						stack.push(board[j][i - 1]);
					}
					board[j][i - 1] = 0;
					break;
				}
			}
		}
	}
}
