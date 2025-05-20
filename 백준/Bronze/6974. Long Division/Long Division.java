import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // 테스트 케이스 개수

        for (int i = 0; i < t; i++) {
            String a = sc.nextLine().trim(); // 분자
            String b = sc.nextLine().trim(); // 분모

            BigInteger numerator = new BigInteger(a);
            BigInteger denominator = new BigInteger(b);

            BigInteger quotient = numerator.divide(denominator); // 몫
            BigInteger remainder = numerator.remainder(denominator); // 나머지

            System.out.println(quotient);
            System.out.println(remainder);

            if (i != t - 1) {
                System.out.println(); // 각 테스트 케이스 사이에 빈 줄 출력
            }
        }
    }
}
