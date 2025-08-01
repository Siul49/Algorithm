import java.util.Scanner;

public class Main {
    static int W=0, B=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        f(0, 0, N, arr);
        System.out.println(W);
        System.out.println(B);
    }

    static void f(int x, int y, int size, int[][] arr) {

        if(size == 1) {
            if (arr[y][x] == 1) {
                B++;
            }
            else if (arr[y][x] == 0) {
                W++;
            }
            return;
        }
        boolean allBlue = true;
        boolean allWhite = true;
        for (int i = y; i < y+size; i++) {
            for (int j = x; j < x+size; j++) {
                if (arr[i][j] == 0) {
                    allBlue = false;
                }
                else if (arr[i][j] == 1) {
                    allWhite = false;
                }
            }
            if (!allBlue && !allWhite) {
                break;
            }
        }
        if (!allBlue && !allWhite) {
            int half = size/2;
            f(x, y, half, arr);
            f(x+half, y, half, arr);
            f(x, y+half, half, arr);
            f(x+half, y+half, half, arr);
        }
        else if (allBlue) {
            B += 1;
        }
        else {
            W += 1;
        }

    }
}