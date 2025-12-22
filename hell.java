import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Reverse a number
        System.out.print("enter a number ");
        int num = scan.nextInt();
        int count=0;

        while (num!=0) {
            num=num/10;
            count=count+1;
        }
        System.out.println(count);

scan.close();

        }
    }