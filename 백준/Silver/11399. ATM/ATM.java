/*
입력
첫째 줄에 사람의 수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄에는 각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어진다. (1 ≤ Pi ≤ 1,000)

출력
첫째 줄에 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 출력한다.

예제 입력 1
5
3 1 4 3 2
예제 출력 1
32
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(s[i]));
        }

        Collections.sort(list);

        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-i; j++) {
                sum += list.get(j);
            }
        }
        System.out.println(sum);
    }
}
