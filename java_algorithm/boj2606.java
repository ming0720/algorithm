package java_algorithm;
import java.util.*;
import java.io.*;
public class boj2606 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        boolean[] visited = new boolean[n+1];
        boolean[][] connect = new boolean[n+1][n+1];

        for(int i = 0; i<m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            connect[a][b] = true;
            connect[b][a] = true;
        }
        int cnt = 0;
        dq.add(1);
        visited[1] = true;
        while(!dq.isEmpty()){
            int tmp = dq.poll();
            for(int i =1; i<=n; i++){
                if(connect[tmp][i] && !visited[i]){
                    dq.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);


    }
}
