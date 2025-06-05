import javax.swing.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int totalWeight = 0;
        Box[] boxes = new Box[N];
        /*
        상자의 정보
        1. 상자의 종류 T
        2. 가로, 높이, 세로 WHL
        공백으로 구분할 것
         */
        for (Box box : boxes) {
            String[] line = sc.nextLine().split(" ");
            box = new Box(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]));
            totalWeight += box.weightOfTotal();
        }


        System.out.println(totalWeight);
        System.out.println(Box.priceOfA);
    }
}

class Box{
    String name;
    int width;
    int height;
    int length;

    int appleNum;

    static int priceOfA = 0;

    int howManyApples(){
        appleNum =  (width/12) * (height/12) *  (length/12);
        priceOfA += appleNum * 4000;
        return appleNum;
    }

    int weightOfTotal(){
        if (name.equals("B")) {
            return 50 * 120;
        }
        else {
            return howManyApples()*500 + 1000;
        }
    }
    Box(String name, int width, int height, int length){
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
    }
}