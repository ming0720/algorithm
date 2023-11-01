package java_algorithm;

import java.io.*;
import java.util.*;

public class boj1141 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] strArr = new String[n];
        for(int i = 0; i < n; i++){
            strArr[i] = br.readLine();
        }

        Arrays.sort(strArr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });

         HashSet<String> set = new HashSet<>();
         for(String s1 : strArr){
             if(set.size() == 0){
                 set.add(s1);
                 continue;
             }

             boolean check = true;
             for(String s2 : set){
                 if(s2.startsWith(s1)){
                     check = false;
                     break;
                 }
             }
             if(check){
                 set.add(s1);
             }
         }
         System.out.println(set.size());
    }
}

