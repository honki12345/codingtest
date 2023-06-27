package doitcodingtest.part02.ch03;

import java.util.Scanner;

public class BOJ11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] input = new int[n + 1];
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int inputNumber = sc.nextInt();
            input[i] = inputNumber;
            sum[i] = sum[i - 1] + inputNumber;
        }

        for (int i = 0; i < m; i++) {
            int j = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(sum[k] - sum[j - 1]);
        }
    }
}
