import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        ArrayList<char[]> dna = new ArrayList<>();
        char[] d;

        for (int i = 0; i < a; i++) {
            d =  scanner.nextLine().toCharArray();
            dna.add(d);

        }

        ArrayList<Character> ans = new ArrayList<>();

        char t = 'T';
        int times = 0;
        int[] dp = new int[4];
        char[] m = {'A', 'C', 'G', 'T'};
        for (int i = 0; i < b; i++) {
            dp[0] = 0; dp[1] = 0; dp[2] = 0; dp[3] = 0;
            t='A';
            for (int j = 0; j < a; j++) {
                switch (dna.get(j)[i]) {
                    case 'A':
                        dp[0]++;
                        break;
                    case 'C':
                        dp[1]++;
                        break;
                    case 'G':
                        dp[2]++;
                        break;
                    case 'T':
                        dp[3]++;
                        break;
                }
            }
            int max = dp[0];
            for (int k = 0; k < 4; k++){
                if (dp[k] > max){
                    max = dp[k];
                    t = m[k];
                }
            }
            ans.add(t);

            for (int k = 0; k < a; k++){
                if (dna.get(k)[i] != ans.get(i)){
                    times++;
                }
            }
            System.out.print(t);
        }
        System.out.println();
        System.out.println(times);
    }
}