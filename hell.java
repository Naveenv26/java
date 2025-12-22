import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // given number is prime or !
        System.out.print("enter a number");
        int num = scan.nextInt();
        int s=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                s++;
            }
        }
        if(s==2){
            System.out.print(num+" is prime");
        }
        else{
            System.out.print(num+" is not prime");
        }

scan.close();
        }
    }