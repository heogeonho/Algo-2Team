package week_8.heogeonho;

import java.util.*;
import java.io.*;

public class BOJ_2xn타일링2 {

    static int[] memoization;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        memoization = new int[n+1];
        Arrays.fill(memoization, -1); // -1로 초기화!

        System.out.println(dpSol(n));
    }

    static int dpSol(int n) {
        // Top Down 방식
        // 점화식: n = (n-1) + {(n-2)*2}
        if (n == 1) return 1;
        if (n == 2) return 3;

        if(memoization[n] != -1) {
            return memoization[n];
        }
        memoization[n] = (dpSol(n-1) + (dpSol(n-2) * 2)) % 10007;
        return memoization[n];
    }
}