
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> apb    = new Vector<String>();



        int rememberAlphabetNumber = sc.nextInt();
        int postItNumber    = sc.nextInt();

        sc.nextLine();

        char[] rememberAlphabet = new char[rememberAlphabetNumber];
        String a = sc.nextLine();

        for (int i = 0; i < rememberAlphabetNumber; i++) {
            rememberAlphabet[i] = a.charAt(i);
        }
        int c = 0;
        for (int i = 0; i < postItNumber; i++) {
            c = 0;
            apb.add(sc.nextLine());
            for (int j = 0; j < apb.get(i).length(); j++) {
                if (apb.get(i).charAt(j) == rememberAlphabet[c]) {
                    c++;
                    if (c == rememberAlphabetNumber) {
                        System.out.println("true");
                        break;
                    }
                }
            }
            if (c != rememberAlphabetNumber) {
                System.out.println("false");
            }
        }
    }
}