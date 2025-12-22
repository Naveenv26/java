import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // average of n numbers
        int sum=0;
        System.out.print("enter how much : ");
        int input=scan.nextInt();
        for(int i=1;i<=input;i++){
            System.out.print(i+" enter the numbers : ");
            int val=scan.nextInt();
            sum=sum+val;
        }
        System.out.println("the Average of "+input+" values are : "+sum/input);


scan.close();
        }
    }