import java.util.Scanner;

public class Main {
    // 알파벳 문자 차이 구하기 (a~z 순환)
    private static int diff(char a, char b) {
        if (b - a >= 0) {
            return b - a;
        } else {
            return 26 - (a - b);
        }
    }

    // 문자 c를 n칸 알파벳 순서대로 이동 (z 다음 a)
    private static char change(char c, int n) {
        for (int i = 0; i < n; i++) {
            if (c == 'z') {
                c = 'a';
            } else {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s1 = sc.next();
            if (s1.charAt(0) == '#') {
                break; // 종료 조건
            }
            String s2 = sc.next();
            String s3 = sc.next();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s1.length(); i++) {
                int diff = diff(s1.charAt(i), s2.charAt(i));
                sb.append(change(s3.charAt(i), diff));
            }

            System.out.println(s1 + " " + s2 + " " + s3 + " " + sb.toString());
        }

        sc.close();
    }
}
