package 조건문;

import java.util.Scanner;

public class Grade_9498 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = scanner.nextInt();

        if(grade >= 90){
            System.out.println("A");
        } else if(grade >= 80){
            System.out.println("B");
        } else if(grade >= 70){
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
