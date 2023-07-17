package java_algorithm;

import java.util.*;
import java.io.*;

public class boj20546{
    static int numJ = 0, numS =0;
    static int jc, sc;
    static String[] stock;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cash = Integer.parseInt(br.readLine());
        stock = br.readLine().split(" ");
        jc = cash;
        sc = cash;

        for(int i = 0; i < 14; i++){
            int now = Integer.parseInt(stock[i]);
            if (jc != 0 && jc / now >0){
                numJ += jc / now;
                jc = jc % now;
            }

            if (i > 2){
                sungmin(now,i);
            }
        }

        jc += numJ * Integer.parseInt(stock[13]);
        sc += numS * Integer.parseInt(stock[13]);

        if(jc > sc){
            System.out.println("BNP");
        }
        else if(jc == sc){
            System.out.println("SAMESAME");
        }
        else if(jc < sc){
            System.out.println("TIMING");
        }

    }
    private static void sungmin(int now, int cnt){
        int num3 = Integer.parseInt(stock[cnt-3]);
        int num2 = Integer.parseInt(stock[cnt-2]);
        int num1 = Integer.parseInt(stock[cnt-1]);

        if(numS !=0 && num1 < now && num2 < num1 && num3 < num2){
            sc += numS * now;
            numS = 0;
        }
        else if(sc != 0 && sc / now >0 && num1 > now && num2 > num1 && num3 > num2){
            numS += sc / now;
            sc = sc % now;
        }
    }
}