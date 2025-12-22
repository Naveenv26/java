import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // find the sum of the digits of a given number
        System.out.print("enter a number");
        int num = scan.nextInt();
        int a,sum=0;
        while(num!=0){
            a=num%10;
            sum=a+sum;
            num=num/10;
            System.out.println(sum);
        }

scan.close();
        }
    }