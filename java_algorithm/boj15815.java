package java_algorithm;

import java.io.*;
import java.util.*;

public class boj15815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char input[] = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i<input.length; i++){
            if(input[i] -'0' >= 0){
                stack.push((int) input[i]-'0');
            } else{
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch(input[i]){
                    case '+':
                        stack.push(num1+num2);
                        break;
                    case '-':
                        stack.push(num2 - num1);
                        break;
                    case '*':
                        stack.push(num1 * num2);
                        break;
                    case '/':
                        stack.push(num2 / num1);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
        br.close();
    }
}
