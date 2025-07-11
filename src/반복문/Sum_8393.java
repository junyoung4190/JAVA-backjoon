package 반복문;

import java.util.Scanner;

public class Sum_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int res = 0;

        for(int i = 1; i <= N; i++){
            res += i;
        }
        System.out.println(res);

    }
}
