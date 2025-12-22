import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // GCD logic
        System.out.print("enter a number ");
        int num = scan.nextInt();
        int sum=0;

        for(int i=1;i<=num-1;i++){
            if(num%i==0){
                sum=i+sum;
            }
        }
        if(num==sum){
            System.out.println(num+" perfect value");
        }
        else{
            System.out.println(num + " not perfect");
        }


scan.close();

        }
    }