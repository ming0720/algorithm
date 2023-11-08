package java_algorithm;

import java.io.*;
import java.util.*;

public class boj12847 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long arr[] = new long[n+1];
        long max = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < n+1; i++){
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = m; i < n+1; i++){
            if(max < arr[i] - arr[i-m]){
                max = arr[i] - arr[i-m];
            }
        }
        System.out.println(max);
    }
}
