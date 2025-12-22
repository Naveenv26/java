import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Reverse a number
        System.out.print("enter a number ");
        int num = scan.nextInt();
        int temp,rev=0;
        while(num!=0){
            temp=num%10;
            rev=(rev*10)+temp;
            num=num/10;
        }
        System.out.println(rev);


scan.close();

        }
    }