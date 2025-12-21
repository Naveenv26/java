import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        try(Scanner scan= new Scanner(System.in)){
            String a=scan.nextLine();
            float b=scan.nextInt();
            scan.nextLine();
            String c=scan.nextLine();
            
            System.out.println("My name is : "+a);
            System.out.println("My score is: "+b/10);
            System.out.println("My dept is: "+c);
        }
    }
}