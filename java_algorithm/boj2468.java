package java_algorithm;

import java.io.*;
import java.util.*;

public class boj2468 {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;

    public static int n;
    public static int[][] graph;
    public static boolean[][] visited;
    public static int max;
    public static int cnt;

    public static HashSet<Integer> set;
    public static ArrayList<Integer> list;
    public static void main(String[] args) throws Exception {
        new boj2468().solution();
    }

    public void solution() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        //br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/java_algorithm/input.txt")));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        set = new HashSet<>();
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
                set.add(graph[i][j]);
            }
        }

        list = new ArrayList<>(set);
        list.add(0);
        max = 0;
        for(int safe : list){
            cnt = 0;
            visited = new boolean[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(!visited[i][j] && graph[i][j]>safe){
                        cnt++;
                        dfs(visited,i,j,safe);
                    }
                }
            }
            max = Math.max(max,cnt);
        }

        System.out.println(max);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(boolean[][] visited, int x, int y,int safe){
        int[] dx = {0,-1,0,1};
        int[] dy = {-1,0,1,0};
        visited[x][y] = true;

        for(int i =0; i<4; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if(visited[nx][ny]) continue;
            if(!visited[nx][ny]){
                if(graph[nx][ny] > safe){
                    dfs(visited,nx,ny,safe);
                } else{
                    continue;
                }
            }
        }
    }
}