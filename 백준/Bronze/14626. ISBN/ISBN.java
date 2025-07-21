import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();  // 13자리 ISBN 입력
        int starIdx = s.indexOf('*'); // * 위치 찾기

        // * 위치에 0~9를 각각 대입하며 check digit이 맞는 숫자를 찾음
        for (int num = 0; num <= 9; num++) {
            int sum = 0;
            for (int i = 0; i < 13; i++) {
                int digit;

                // *자리에 대입
                if (i == starIdx) {
                    digit = num;
                } else {
                    digit = s.charAt(i) - '0';
                }
                // 가중치 (홀수자리 1, 짝수자리 3)
                sum += digit * (i % 2 == 0 ? 1 : 3);
            }
            if (sum % 10 == 0) {
                // 찾으면 출력 후 종료
                System.out.println(num);
                break;
            }
        }
    }
}
