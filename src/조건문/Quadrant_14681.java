package 조건문;

import java.util.Scanner;

public class Quadrant_14681 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A > 0 && B > 0){
            System.out.println("1");
        } else if (A < 0 && B > 0) {
            System.out.println("2");
        } else if (A < 0 && B < 0) {
            System.out.println("3");
        } else if (A > 0 && B < 0) {
            System.out.println("4");
        }
    }
}
