package java_algorithm;

import java.util.*;
import java.io.*;
public class boj1406 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayDeque<String> left = new ArrayDeque<>();
        ArrayDeque<String> right = new ArrayDeque<>();

        String str = br.readLine();
        int len = str.length();
        int n = Integer.parseInt(br.readLine());

        String[] arr = str.split("");
        for(String s : arr){
            left.push(s);
        }

        for(int i =0; i < n; i++){
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c){
            case 'L':
                if(!left.isEmpty())
                    right.push(left.pop());
                break;

            case 'D':
                if(!right.isEmpty())
                    left.push(right.pop());
                break;

            case 'B':
                if(!left.isEmpty())
                    left.pop();
                break;

            case 'P':
                char x = command.charAt(2);
                left.push(String.valueOf(x));
                break;

            default:
                break;
            }
        }
        while(!left.isEmpty()){
            right.push(left.pop());
        }

        while(!right.isEmpty()){
            bw.write(right.pop());
        }

        bw.flush();
        bw.close();
    }

}
