package oct.Task_oct17;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m >= 90) {
            System.out.println("A");
        } else if (m >= 80 && m < 90) {
            System.out.println("B");
        } else if (m >= 70 && m < 80) {
            System.out.println("C");
        } else if (m >= 60 && m < 70) {
            System.out.println("D");
        } else if (m < 60) {
            System.out.println("F");
        }
    }
}