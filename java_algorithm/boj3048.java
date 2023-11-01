package java_algorithm;

import java.io.*;
import java.util.*;

public class boj3048 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        String s1 = br.readLine();
        for(int i = s1.length()-1; i >=0 ; i--){
            arr1.add(s1.charAt(i));
        }

        String s2 = br.readLine();
        for(int i = 0; i<s2.length(); i++){
            arr2.add(s2.charAt(i));
        }

        int[] index = new int[n1+n2];
        char[] ant = new char[n1+n2];

        for(int i = 0; i < n1; i++){
            ant[i] = arr1.get(i);
            index[i] = 1;
        }

        for(int i = n1; i < n1 + n2 ; i++){
            ant[i] = arr2.get(i-n1);
            index[i] = 2;
        }

        int t = Integer.parseInt(br.readLine());

        while(t>0){
            t--;
            for(int i = 0; i< n1+n2-1; i++){
                if(index[i]==1 && index[i+1]==2){//마주치면
                    char tmp = ant[i];
                    ant[i] = ant[i+1];
                    ant[i+1] = tmp;

                    int it = index[i];
                    index[i] = index[i+1];
                    index[i+1] = it;
                    i++;
                }
            }
        }

        for(int i = 0; i<n1+n2; i++){
            sb.append(ant[i]);
        }
        System.out.println(sb.toString());
    }
}
