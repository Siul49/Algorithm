import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int N, M;
    static int[] comb;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        comb = new int[M];
        dfs(1, 0);
        bw.flush();
        bw.close();
        br.close();
    }

    // start: 다음에 고려할 숫자, depth: 현재까지 선택한 숫자의 개수
    static void dfs(int start, int depth) throws IOException {
        if (depth == M) {
            // 조합 완성: 출력
            for (int i = 0; i < M; i++) {
                bw.write(comb[i] + (i < M - 1 ? " " : ""));
            }
            bw.write("\n");
            return;
        }
        // start부터 N까지 수를 하나씩 선택
        for (int num = start; num <= N; num++) {
            comb[depth] = num;
            dfs(num + 1, depth + 1);
        }
    }
}
