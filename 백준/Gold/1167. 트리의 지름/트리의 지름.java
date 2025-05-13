import java.io.*;
import java.util.*;

class Main {
    static class Node {
        int to;
        int dis;

        Node(int to, int dis) {
            this.to = to;
            this.dis = dis;
        }
    }

    static int N, maxDis = 0, maxNode = 1;
    static List<Node>[] tree;
    static boolean[] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        N = Integer.parseInt(br.readLine()); // 정점의 개수
        tree = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            while (true) {
                int to = Integer.parseInt(st.nextToken());
                if (to == -1) break;

                int dis = Integer.parseInt(st.nextToken());

                tree[from].add(new Node(to, dis));
            }
        }

        // 로직
        calculateDistance();
    }

    private static void dfs(int now, int dis) {
        if (dis > maxDis) {
            maxDis = dis;
            maxNode = now;
        }

        for (Node node : tree[now]) {
            int to = node.to;
            if (now != to && !visited[to]) {
                visited[to] = true;
                dfs(to, dis + node.dis);
            }
        }
    }

    private static void calculateDistance() {

        int start = 1, dis = 0;
        visited = new boolean[N + 1];
        visited[start] = true;
        dfs(start, dis);

        dis = 0;
        visited = new boolean[N + 1];
        visited[maxNode] = true;
        dfs(maxNode, dis);

        System.out.println(maxDis);
    }
}