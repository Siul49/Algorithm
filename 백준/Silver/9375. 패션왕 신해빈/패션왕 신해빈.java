import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt(); // 테스트 케이스 수

        while (testCase-- > 0) {
            int n = sc.nextInt(); // 의상의 수
            HashMap<String, Integer> clothesMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String name = sc.next(); // 의상 이름 (필요 없음)
                String type = sc.next(); // 의상 종류

                // 의상 종류별 개수 카운트
                clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
            }

            int result = 1;

            // 각 의상 종류별로 (개수 + 1)을 곱함
            for (int count : clothesMap.values()) {
                result *= (count + 1);
            }

            // 알몸인 상태를 제외
            System.out.println(result - 1);
        }

        sc.close();
    }
}
