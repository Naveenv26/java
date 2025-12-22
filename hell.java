import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Palindrome or not
        System.out.print("enter a number");
        int num = scan.nextInt();
        int temp,a=0,b=num;
        while(b!=0){
            temp=b%10;
            a=(a*10)+temp;
            System.out.println(temp+"--"+a);
            b=b/10;
        }
        if(num==a){
            System.out.println("the number "+num+" is palindrome ");
        }
        else{
            System.out.println("the number "+num+" is not palindrome ");
        }

scan.close();
        }
    }