import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            String s = sc.next();
            String p = sc.next();
            int time = 0;
            int i = 0;
            while (i < s.length()) {
                if (i + p.length() <= s.length() && s.substring(i, i + p.length()).equals(p)) {
                    time += 1;  // 붙여넣기 1초
                    i += p.length();
                } else {
                    time += 1;  // 타이핑 1초
                    i += 1;
                }
            }
            System.out.println(time);
        }
        sc.close();
    }
}
