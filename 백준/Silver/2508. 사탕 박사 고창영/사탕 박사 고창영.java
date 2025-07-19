import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int  T = input.nextInt();



        for (int k = 1; k <= T; k++){
            int H = input.nextInt();
            int W = input.nextInt();

            char[][] box = new char[H][W];
            int cnt = 0;

            input.nextLine();

            for(int i=0;i<H;i++) {
                String s = input.nextLine();
                for (int j = 0; j < W; j++) {
                    box[i][j] = s.charAt(j);
                }
            }
            for (int i=0;i<H;i++) {
                for (int j = 0; j < W; j++) {
                    if (box[i][j] == '^') {
                        if (i >= 2) {
                            if (box[i - 1][j] == 'o' && box[i - 2][j] == 'v') {
                                cnt++;
                            }
                        }
                    } else if (box[i][j] == '<') {
                        if (j >= 2) {
                            if (box[i][j - 1] == 'o' && box[i][j - 2] == '>') {
                                cnt++;
                            }
                        }
                    }
                }

            }
            System.out.println(cnt);
        }


    }

}