package java_algorithm;

import java.io.*;
import java.util.*;

public class boj5212 {

    static int R,C;
    static char map[][];

    static ArrayDeque<int[]> dq;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        R = Integer.parseInt(st.nextToken());
        C =Integer.parseInt(st.nextToken());

        map = new char[R][C];

        dq = new ArrayDeque<>();
        for(int i = 0; i<R; i++){
            String line = br.readLine();
            for(int j = 0; j<C; j++){
                map[i][j] = line.charAt(j);
                if(map[i][j] == 'X')
                    dq.add(new int[]{i,j});
            }
        }

        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        int size = dq.size();

        for(int i = 0; i<size; i++){
            int[] pop = dq.poll();
            int r = pop[0];
            int c = pop[1];
            int cnt = 0;

            for(int j = 0; j <4; j++){
                int nr = r + dr[j];
                int nc = c + dc[j];

                if(nr >= R || nc >= C || nr <0 || nc < 0){
                    cnt++;
                    continue;
                }

                if(map[nr][nc] == '.')
                    cnt++;
            }
            if(cnt >= 3){
                map[r][c] = '-';
            } else
                dq.add(new int[]{r,c});
        }

        ArrayList<int[]> list = new ArrayList<>(dq);
        int minR = R, maxR = 0, minC = C, maxC = 0;
        for(int i = 0; i < list.size(); i++){
            int[] rc = list.get(i);
            minR = Math.min(minR, rc[0]);
            maxR = Math.max(maxR, rc[0]);
            minC = Math.min(minC, rc[1]);
            maxC = Math.max(maxC, rc[1]);
        }

        for(int i = minR; i<=maxR; i++){
            for(int j = minC; j<=maxC; j++){
                char c = map[i][j];
                if(c == '-'){
                    bw.write('.');
                } else bw.write(c);
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
