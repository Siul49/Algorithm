import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = sc.nextInt();
            if (arr[i - 1] > 0){
                sum += arr[i - 1];
            }
            else if (arr[i - 1] <= 0) {
                sum -= arr[i - 1];
            }
        }
        sc.nextLine();
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = sc.nextInt();
            if (arr[i - 1] > 0) {
                sum += arr[i - 1];
            } else if (arr[i - 1] <= 0) {
                sum -= arr[i - 1];
            }
        }
        System.out.println(sum);
    }
}
