import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // ind the largest number among three numbers
        System.out.print("enter 1st number");
        int num1 = scan.nextInt();
        System.out.print("enter 2nd number");
        int num2 = scan.nextInt();
        System.out.print("enter 3rd number");
        int num3 = scan.nextInt();

        if(num1> num2 && num1>num3){
            System.out.println("num1 is bigger");
        }
        else if(num2> num1 && num2>num3){
            System.out.println("num2 is bigger");
        }
        else if(num3> num1 && num3>num2){
            System.out.println("num3 is bigger");
        }
        else{
            System.out.println("all are equal");
        }
        
scan.close();

        }
    }