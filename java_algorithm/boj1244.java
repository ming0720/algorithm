package java_algorithm;

import java.io.*;
import java.util.*;

public class boj1244 {

    static int[] state;
    static int n;
    static int student;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        state = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =1; i < state.length; i++){
            state[i] = Integer.parseInt(st.nextToken());
        }

        student = Integer.parseInt(br.readLine());

        for(int i =0; i<student; i++){
            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());

            if (gender == 1){
                boy(Integer.parseInt(st.nextToken()));
            }
            else if(gender == 2){
                girl(Integer.parseInt(st.nextToken()));
            }
        }

        for(int i = 1; i<state.length; i++){
            System.out.print(state[i] + " ");
            if(i % 20 == 0){
                System.out.println();
            }
        }
        br.close();

    }

    private static void boy(int num){
        int now = num;
        while(now < state.length){
            if(state[now] == 0){
                state[now] = 1;
            } else if(state[now] == 1){
                state[now] = 0;
            }
            now += num;
        }
    }

    private static void girl(int num){
        if(state[num] == 0){
            state[num] = 1;
        } else if(state[num] == 1){
            state[num] = 0;
        }
        int cnt = 1;
        while((num - cnt) > 0 && (num + cnt) < state.length){
            if(state[num + cnt] == state[num - cnt]){
                if(state[num + cnt] == 0){
                    state[num + cnt] = 1;
                    state[num - cnt] = 1;
                } else if(state[num + cnt] == 1){
                    state[num + cnt] = 0;
                    state[num - cnt] = 0;
                }
                cnt++;
            } else{
                break;
            }
        }
    }
}
