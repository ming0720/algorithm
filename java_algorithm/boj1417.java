package java_algorithm;
import java.util.*;
import java.io.*;
public class boj1417 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->(o2-o1));
        for(int i = 0; i < n-1; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        int person = 0;

        while(!pq.isEmpty()){
            int top = pq.poll();
            if(top >= dasom && top - 1 > 0){
                top--;
                dasom++;
                pq.add(top);
                person++;
            } else{
                break;
            }
        }
        System.out.println(person);


    }
}
