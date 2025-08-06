import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
                continue;
            }
            Set<Character> digits = new HashSet<>();
            int cnt = 0;
            int multiple = N;
            while (digits.size() < 10) {
                cnt++;
                int now = multiple * cnt;
                for (char ch : String.valueOf(now).toCharArray()) {
                    digits.add(ch);
                }
            }
            System.out.println("Case #" + i + ": " + (multiple * cnt));
        }
    }
}
