import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // GCD logic
        System.out.print("enter a number ");
        int num1 = scan.nextInt();
        System.out.print("enter a number ");
        int num2 = scan.nextInt();
        int a=0;

            for(int i=1;i<=(num1);i++){
                if(num2%i==0 && num1%i==0){
                    a=i;
                }
            }
        System.out.println(a);
        
        
scan.close();

        }
    }