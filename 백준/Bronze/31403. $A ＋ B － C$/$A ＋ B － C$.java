/*
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	202406	78757	58481	36.871%
문제
2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.



입력
첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

출력
첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.

예제 입력 1
2
예제 출력 1
2
예제 입력 2
9
예제 출력 2
55
*/

import java.io.*;

public class Main {
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        System.out.println(Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C));
        System.out.println(Integer.parseInt(A+B) - Integer.parseInt(C));


    }
}