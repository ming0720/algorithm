package java_algorithm;
import java.util.*;
import java.io.*;
public class boj21921 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] blog = new int[n];
        int[] sum = new int[n+1];
        int v = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            blog[i] = Integer.parseInt(st.nextToken());
            v += blog[i];
            sum[i+1] = v; // sum[1] = 0~0 / sum[2] = 0 ~ 1/ sum[3] = 0~2
        }
        int max = -1;
        int cnt = 1;
        sum[0] = 0;
        // 0~4까지 sum[5] - sum[0] / 1~5까지 sum[6] - sum[1]
        for(int i = 0; i < n-x+1; i++) {

            if(sum[i+x] - sum[i] > max){
                max = sum[i+x] - sum[i];
                cnt = 1;
            } else if(sum[i+x] - sum[i] == max){
                cnt++;
            }
        }

        if(max == 0){
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(cnt);
        }
    }
}
