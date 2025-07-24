import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum = 0;
        String sik = input.nextLine();
        String[] s = sik.split("(?=[-+])|(?<=[-+])");

        boolean minus = false;
        for(int i=0; i<s.length; i++){
            if (s[i].equals("-")){
                minus = true; 
            }

            if (!s[i].equals("+") && !s[i].equals("-")){
                if (minus){
                    sum -= Long.parseLong(s[i]);
                } else {
                    sum += Long.parseLong(s[i]);
                }
            }
        }

        System.out.println(sum);
    }
}
