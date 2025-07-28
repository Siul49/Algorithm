import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] trees = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();
            if (trees[i] > max) max = trees[i];
        }

        int left = 0;
        int right = max;
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;
            for (int h : trees) {
                if (h > mid) sum += h - mid;
            }
            if (sum >= m) {
                result = mid;      // 더 높은 높이도 가능한지 탐색
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}
