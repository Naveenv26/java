import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // factorial
        System.out.println("enter a value : ");
        int a=1;
        int val=scan.nextInt();
        for(int i=1;i<=val;i++){
            a=a*i;
            System.out.println(a);
        }


scan.close();
        }
    }