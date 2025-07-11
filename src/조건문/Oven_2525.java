package 조건문;

import java.util.Scanner;

public class Oven_2525 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int C = scanner.nextInt();
        scanner.close();

        int min = A * 60 + B + C;

        int h = (min / 60) % 24;
        int m = min % 60;

        System.out.println(h + " " + m);
    }
}
