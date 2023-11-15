package java_algorithm;
import java.util.*;
import java.io.*;

public class boj16435 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        st =  new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            pq.add(Integer.parseInt(st.nextToken()));
        }
        while(!pq.isEmpty()){
            if(pq.peek() <= len) {
                pq.poll();
                len++;
            } else{
                break;
            }
        }
        System.out.println(len);

    }
}
