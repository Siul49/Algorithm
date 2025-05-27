import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 100, b = 100;

        int t = scanner.nextInt();
        int p, q;
        for (int i = 0; i < t; i++){
            p = scanner.nextInt();
            q = scanner.nextInt();
            if (p < q){
                a -= q;
            }
            else if (p > q){
                b -= p;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}