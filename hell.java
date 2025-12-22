import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // pattern printing
        System.out.print("enter a number ");
        int num1 = scan.nextInt();
        for(int i=1;i<=num1;i++){
            System.out.println(" ");
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
scan.close();

        }
    }