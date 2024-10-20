package oct.Task_oct18;

import java.util.Scanner;

public class converts_between_different_units {
    public static void main(String[] args) {
        System.out.println("case 1 - Kilometers to Miles conversion");
        System.out.println("case 2 - Miles to Kilometers conversion");
        System.out.println("case 3 - Celsius to Fahrenheit conversion");
        System.out.println("case 4 - Fahrenheit to Celsius conversion");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter no of Kilometers");
                int km1 = sc.nextInt();
                float mile1 = (float)(km1/0.621371);
                System.out.println(mile1);
                break;
            case 2:
                System.out.println("Enter no of Miles");
                float mile2 = sc.nextFloat();
                double km2 = (mile2*0.621371);
                System.out.println(km2);
                break;
            case 3:
                System.out.println("Enter temperature in degrees");
                float d1 = sc.nextFloat();
                double f1 = (d1 * (9 / 5)) + 32;
                System.out.println(f1);
                break;
            case 4:
                System.out.println("Enter temperature in fahrenheit");
                float f2 = sc.nextFloat();
                double d2 = ((f2-32) * (5 / 9));
                System.out.println(f2);
                break;
        }
    }
}
