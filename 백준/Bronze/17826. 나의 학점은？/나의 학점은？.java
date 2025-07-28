import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[50];
        for (int i = 0; i < 50; i++) {
            scores[i] = sc.nextInt();
        }
        sc.nextLine();

        int grade = 0;
        int hongik = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < 50; i++) {
            if (scores[i] == hongik) {
                grade = i+1;
                break;
            }
        }

        if (grade  < 6){
            System.out.println("A+");
        }
        else if (grade  < 16){
            System.out.println("A0");
        }
        else if (grade  < 31){
            System.out.println("B+");
        }
        else if (grade  < 36){
            System.out.println("B0");
        }
        else if (grade  < 46){
            System.out.println("C+");
        }
        else if (grade  < 49){
            System.out.println("C0");
        }
        else {
            System.out.println("F");
        }
    }
}