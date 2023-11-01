package java_algorithm;
import java.util.*;
import java.io.*;
public class boj7568 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i = 0; i<n; i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            int rank = 1;
            for(int j = 0; j <n; j++){
                if(i == j)
                    continue;
                if(arr[i][0] < arr[j][0] && arr[i][1]<arr[j][1]){
                    rank++;
                }
            }
            bw.write(String.valueOf(rank));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
