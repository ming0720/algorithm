package java_algorithm;
import java.io.*;
import java.util.*;

public class boj16967 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] A = new int[h][w];
        int[][] B = new int[h+x][w+y];

        for(int i = 0; i<B.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<B[i].length; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < x; i++){
            for(int j = 0; j < w; j++){
                A[i][j] = B[i][j];
            }
        }

        for(int i = x; i < h; i++ ){
            for(int j = 0; j < y; j++){
                A[i][j] = B[i][j];
            }
        }

        for(int i = x; i < h; i++){
            for(int j = y; j < w; j++){
                A[i][j] = B[i][j]-A[i-x][j-y];
            }
        }

        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A[i].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }

}
