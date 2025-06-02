import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String S = sc.nextLine();

        boolean hasUpper = S.matches(".*[A-Z].*");
        boolean hasLower = S.matches(".*[a-z].*");
        boolean hasDigit = S.matches(".*[0-9].*");
        boolean hasSpecial = S.matches(".*[!@#$%^&*()_\\+].*"); // 특수문자 수정

        int require = 0;
        if (!hasUpper) require++;
        if (!hasLower) require++;
        if (!hasDigit) require++;
        if (!hasSpecial) require++;

        // 길이 보정 계산 (핵심!)
        int addLength = Math.max(6 - S.length(), 0);
        require = Math.max(require, addLength);

        System.out.println(require);
    }
}
