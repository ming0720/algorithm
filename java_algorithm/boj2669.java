package java_algorithm;

import java.io.*;
import java.util.*;

public class boj2669 {
    static int max = 100;
    static int[][] area = new int[max][max];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i =0; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            square(x1,y1,x2,y2);
        }
        System.out.println(sumArea());
        br.close();
    }

    public static void square(int x1, int y1, int x2, int y2){
        for(int i = x1; i<x2; i++){
            for(int j = y1; j<y2; j++){
                area[i][j] = 1;
            }
        }
    }

    public static int sumArea(){
        int sum =0;
        for(int i =0; i < max; i++){
            for(int j=0; j<max; j++){
                sum += area[i][j];
            }
        }
        return sum;
    }

}
