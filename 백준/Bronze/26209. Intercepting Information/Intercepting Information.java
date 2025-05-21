import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[8];
        boolean flag = true;
        String[] s = sc.nextLine().split(" ");

        for (int i = 0; i < numbers.length; i++) {
            if (!(s[i].equals("1") || s[i].equals("0"))) { flag = false; break; }
            numbers[i] = Integer.parseInt(s[i]);
        }
        if (flag) {
            System.out.println("S");
        }else{
            System.out.println("F");
        }
    }
}