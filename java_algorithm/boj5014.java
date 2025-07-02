package java_algorithm;

import java.util.*;
import java.io.*;
public class boj5014 {
    static int f,s,g,u,d;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        f = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        int answer = bfs(s);
        if(answer == -1){
            System.out.println("use the stairs");
        } else {
            System.out.println(answer);
        }

    }
    public static int bfs(int start){
        boolean[] visit = new boolean[f+1];
        int[] dist = new int[f+1];

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(start);
        visit[start] = true;
        dist[start] = 0;

        while(!dq.isEmpty()){
            int now = dq.poll();

            if(now == g){
                return dist[now];
            }
            int up = now + u;
            int down = now - d;

            if(up <= f && !visit[up]){
                dq.add(up);
                dist[up] = dist[now] + 1;
                visit[up] = true;
            }
            if(down >= 1 && !visit[down]){
                dq.add(down);
                dist[down] = dist[now] + 1;
                visit[down] = true;
            }
        }
        return -1;
    }
}
