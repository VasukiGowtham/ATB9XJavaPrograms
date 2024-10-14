package oct.Task_oct9;

public class printTable_usingPrintf {
    public static void main(String[] args){
        int a=5;
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d", a, i, a*i);
            System.out.println();
        }
    }
}
