import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        long solution = 1;
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            solution = 1;
            if (N % 2 == 0) {
                for (int j = 1; j <= N / 2; j++) {
                    solution = solution * 2;
                }
            }
            else {
                solution = 0;
            }

            System.out.println(solution);
        }
    }
}
