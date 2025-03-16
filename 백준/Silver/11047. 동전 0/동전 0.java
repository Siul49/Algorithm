
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int N, k;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s;

        s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);


        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = N-1; i >= 0; i--) {
            cnt += k/arr[i];
            k %= arr[i];
        }

        System.out.println(cnt);
    }
}
