import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        recursion r = new recursion();
        System.out.println(r.printOdd(10));
    }
}
class recursion{
    static int printOdd(int n){
        if(n==1)
        {
            System.out.println(n);
            return 0;
        }
        if(n%2!=0){
            System.out.println(n);
            printOdd(n-2);
        }
        if(n%2==0){
            System.out.println(n);
            printOdd(n-1);
        }
        return 1;
    }
}
