package java_algorithm;

import java.util.*;
import java.io.*;

public class boj1246 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < m; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);

        int price = 0;
        int max = 0;
        int tmpsum = 0;

        for(int i = 0; i < m; i++){
            int tmp = arr.get(i);

            if(m-i < n){
                tmpsum = tmp * (m-i);
            } else {
                tmpsum = tmp * n;
            }

            if(tmpsum > max){
                max = tmpsum;
                price = tmp;
            }

        }

        System.out.println(price + " " + max);
    }
}
