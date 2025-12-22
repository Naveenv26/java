import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // ind the largest number among three numbers
        System.out.print("enter a number");
        int num = scan.nextInt();
        int temp=num,a,sum=0,al;
        while(temp!=0){
            a=temp%10;
            al=a*a*a;
            sum=al+sum;
            System.out.println(sum);
            temp=temp/10;
        }
        if(num==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not a Armstrong number");
        }
        
scan.close();

        }
    }