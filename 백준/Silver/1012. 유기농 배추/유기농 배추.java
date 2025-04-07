import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {0, 0, 1, -1}; // 오른쪽, 왼쪽, 아래, 위
    static int[] dy = {1, -1, 0, 0};

    static class Cabbage {
        int x, y;
        boolean visited;

        Cabbage(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void bfs(Cabbage start, Cabbage[] cabbages) {
        Queue<Cabbage> q = new LinkedList<>();
        q.add(start);
        start.visited = true;

        while (!q.isEmpty()) {
            Cabbage curr = q.poll();

            for (Cabbage next : cabbages) {
                if (!next.visited) {
                    for (int i = 0; i < 4; i++) {
                        int nx = curr.x + dx[i];
                        int ny = curr.y + dy[i];
                        if (nx == next.x && ny == next.y) {
                            next.visited = true;
                            q.add(next);
                            break; // 더 이상 방향 확인 안 해도 됨
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int width = Integer.parseInt(input[0]);
            int height = Integer.parseInt(input[1]);
            int n = Integer.parseInt(input[2]);

            Cabbage[] cabbages = new Cabbage[n];
            for (int i = 0; i < n; i++) {
                String[] pos = br.readLine().split(" ");
                int x = Integer.parseInt(pos[0]);
                int y = Integer.parseInt(pos[1]);
                cabbages[i] = new Cabbage(x, y);
            }

            int count = 0;
            for (Cabbage c : cabbages) {
                if (!c.visited) {
                    bfs(c, cabbages);
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
