package java_algorithm;

import java.util.*;

public class boj1475 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int[] arr = new int[10];
        for(int i = 0; i < s.length(); i++){
            int num = s.charAt(i)-'0';
            if(num == 6){
                arr[9]++;
            } else{
                arr[num]++;
            }
        }

        int max = 0;
        for(int i = 0; i < 9; i++){
            max = Math.max(max,arr[i]);
        }
        int nine = arr[9]/2 + arr[9] % 2;

        max = Math.max(max,nine);
        System.out.println(max);

    }
}
