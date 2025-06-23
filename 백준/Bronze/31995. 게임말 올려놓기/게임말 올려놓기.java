import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        if (N <= 1 || M <= 1){
            System.out.println(0);
            return;
        }

        int answer = (N-1) * (M-1) * 2;
        System.out.println(answer);

    }
}