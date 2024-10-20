package oct.Task_oct15;

public class Largest_of_Three_Numbers {
    public static void main(String[] args) {
        int a =1;
        int b=2;
        int c=3;
        int result = (a>b && a>c)? a: (b>c)? b:c;
        System.out.println(result);
    }
}
