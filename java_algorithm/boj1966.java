package java_algorithm;

import java.util.*;
import java.io.*;
public class boj1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int test = Integer.parseInt(st.nextToken());


        while (test-- > 0) {
            ArrayDeque<int[]> dq = new ArrayDeque<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                dq.add(new int[]{i, a});
                pq.add(a);
            }
            int ans = 1;
            while (!pq.isEmpty() && !dq.isEmpty()) {
                int[] temp = dq.poll();

                if (temp[1] != pq.peek()) {
                    dq.add(temp);
                } else {

                    if (temp[0] == m) {
                        break;
                    } else {
                        pq.poll();

                    }
                    ans++;
                }

            }
            System.out.println(ans);
        }

    }

}
