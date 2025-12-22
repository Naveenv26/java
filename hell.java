import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // LCM
        System.out.print("enter a number ");
        int num1 = scan.nextInt();
        System.out.print("enter a number ");
        int num2 = scan.nextInt();
        int val=0,lcm;
        for(int i=1;i<=num1;i++){
            if(num1%i==0 && num2%i==0){
                val=i;
                System.out.println(val);
            }
        }
        lcm=(num1*num2)/val;
        System.out.println(lcm);
scan.close();

        }
    }