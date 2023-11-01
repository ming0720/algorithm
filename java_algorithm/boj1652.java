package java_algorithm;
import java.io.*;
import java.util.*;

public class boj1652 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] room = new char[n][n];

        for(int i = 0; i<n; i++){
            String[] str = br.readLine().split("");
            for(int j = 0; j < n; j++){
                room[i][j] = str[j].charAt(0);
            }
        }

        int row = 0;
        int col = 0;

        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i+1<n){
                    if(room[i][j] == '.' && room[i+1][j] == '.' && (i+2 >= n || room[i+2][j] == 'X')){
                        col++;
                    }
                }
                if(j+1<n){
                    if(room[i][j] == '.' && room[i][j+1]=='.' && (j+2 >= n || room[i][j+2] == 'X')){
                        row++;
                    }
                }
            }
        }

        System.out.println(row +" "+ col);


    }
}
