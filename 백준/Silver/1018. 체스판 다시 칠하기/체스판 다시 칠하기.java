import java.util.Scanner;

public class Main {
    static int N, M;
    static char[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        N = sc.nextInt();
        M = sc.nextInt();
        board = new char[N][M];
        
        for (int i = 0; i < N; i++) {
            board[i] = sc.next().toCharArray();
        }
      
        int minRepaint = Integer.MAX_VALUE;
        
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int repaintCount = Math.min(
                    countRepaint(i, j, 'W'),
                    countRepaint(i, j, 'B')
                );
                minRepaint = Math.min(minRepaint, repaintCount);
            }
        }
        
        System.out.println(minRepaint);
        sc.close();
    }
  
    // (x,y)부터 8x8 영역에서 시작 색깔 startColor로 칠할 때 다시 칠해야 하는 칸 수 계산
    static int countRepaint(int x, int y, char startColor) {
        int repaint = 0;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // 칠해야 할 색깔은 체스판처럼 8x8 영역 안에서 행+열 합이 짝수면 startColor, 홀수면 반대색
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != startColor) {
                        repaint++;
                    }
                } else {
                    if (board[i][j] == startColor) {
                        repaint++;
                    }
                }
            }
        }
        return repaint;
    }
}
