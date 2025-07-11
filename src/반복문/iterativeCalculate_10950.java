package 반복문;

import java.util.Scanner;

public class iterativeCalculate_10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i < N; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);
        }
    }
}
