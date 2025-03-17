/*
문제
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000),
탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다.
입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다.
V부터 방문된 점을 순서대로 출력하면 된다.
*/

import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int vertex, edge, firstVertex;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        vertex = Integer.parseInt(input[0]);
        edge = Integer.parseInt(input[1]);
        firstVertex = Integer.parseInt(input[2]);

        visited = new boolean[vertex+1];

        for (int i = 0; i < vertex+1; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            input = br.readLine().split(" ");
            adjList.get(Integer.parseInt(input[1])).add(Integer.parseInt(input[0]));
            adjList.get(Integer.parseInt(input[0])).add(Integer.parseInt(input[1]));
        }

        for (int i = 1; i <= vertex; i++) {
            adjList.get(i).sort(Collections.reverseOrder());
        }

        // dfs
        dfs(firstVertex);

        for (int i = 0; i < vertex+1; i++) {
            visited[i] = false;
        }

        System.out.println();

        // bfs
        bfs(firstVertex);
    }

    static void bfs(int vertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            visited[currentVertex] = true;

            for (int i = adjList.get(currentVertex).size()-1; i >= 0; i--) {
                if (!visited[adjList.get(currentVertex).get(i)]) {
                    visited[adjList.get(currentVertex).get(i)] = true;
                    queue.add(adjList.get(currentVertex).get(i));
                }
            }
        }
    }

    static void dfs(int vertex) {
        System.out.print(vertex + " ");
        visited[vertex] = true;

        for (int i = adjList.get(vertex).size()-1; i >= 0 ; i--) {
            if (!visited[adjList.get(vertex).get(i)]) {
                dfs(adjList.get(vertex).get(i));
            }
        }
    }
}
