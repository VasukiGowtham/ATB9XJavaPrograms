package oct.Task_oct16;

import java.util.Scanner;

public class Scanner_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        int Age = sc.nextInt();
        long Salary = sc.nextLong();

        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Salary);
    }
}
