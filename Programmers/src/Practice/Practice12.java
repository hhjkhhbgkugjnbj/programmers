package Practice;

public class Practice12 {
	public static void main(String[] args) {
		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		System.out.println(solution(dots));
	}
	
    static int solution(int[][] dots) {
        
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            maxX = Math.max(maxX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxY = Math.max(maxY, dot[1]);
        }
        
        // 너비와 높이 계산
        int width = maxX - minX;
        int height = maxY - minY;

        // 넓이 계산
        return width * height;
    }
}
