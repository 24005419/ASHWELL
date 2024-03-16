import java.util.Scanner;

public class ashwell{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("enter first number ");
        a = scan.nextInt();
        System.out.println("enter second number ");
        b = scan.nextInt();
        c = a - b;
        System.out.println("answer is :" + c);
    }
}