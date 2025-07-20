import java.util.Scanner;

public class Main {
        public static void main(String[] args){ 
            Scanner input = new Scanner(System.in);
            long[] arr = new long[101];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 1;
            arr[4] = 2;
            arr[5] = 2;
            
            for (int i = 6; i < 101; i++){
                arr[i] = arr[i-5] + arr[i-1];
            }
            
            int T = input.nextInt();
            
            for (int i = 1; i <= T; i++){
                int N = input.nextInt();
                System.out.println(arr[N]);
            }
        }
}