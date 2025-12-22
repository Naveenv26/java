import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Fibonacci series
        System.out.print("enter a number");
        int num = scan.nextInt();
        int a=-1,b=1;
        int c;
        for(int i=1;i<=num;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

scan.close();
        }
    }