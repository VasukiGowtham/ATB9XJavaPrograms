package oct.Task_oct16;

public class arguments_practice {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int result = a>b? a:b;
        System.out.println(result);
    }
}
