import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    int direction;
    char[][] matrix;
    int N;
    boolean getDirection(){
        return direction == 2;
    }

    void setDirectionN(){
        N = sc.nextInt();
        direction = sc.nextInt();
        sc.nextLine();
    }

    void setMatrix(){
        setDirectionN();
        matrix = new char[N][N];
        for(int i = 0; i < N; i++){
            String s = sc.nextLine();
            for(int j = 0; j < N; j++){
                matrix[i][j] = s.charAt(j);
            }
        }
    }

    void turnRL(){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == 'd'){
                    matrix[i][j] = 'b';
                }
                else if (matrix[i][j] == 'b'){
                    matrix[i][j] = 'd';
                }
                if (matrix[i][j] == 'p'){
                    matrix[i][j] = 'q';
                }
                else if (matrix[i][j] == 'q'){
                    matrix[i][j] = 'p';
                }
            }
        }
    }

    void turnUD(){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == 'p'){
                    matrix[i][j] = 'b';
                }
                else if (matrix[i][j] == 'b'){
                    matrix[i][j] = 'p';
                }
                if (matrix[i][j] == 'q'){
                    matrix[i][j] = 'd';
                }
                else if (matrix[i][j] == 'd'){
                    matrix[i][j] = 'q';
                }
            }
        }
    }


    void turn(boolean direction){
        if (direction){
            turnRL();
        } else {
            turnUD();
        }
    }

    void show(){
        for (char[] chars : matrix) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    void play(){
        setMatrix();
        turn(getDirection());
        show();
    }

    public static void main(String[] args){
        Main m = new Main();
        m.play();
    }
}
