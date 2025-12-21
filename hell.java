import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.mul");
        int choice= scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1.ADD");
                break;
            case 2:
                System.out.println("2.SUB");
                break;
            case 3:
                System.out.println("3.mul");
                break;
        
            default:
                System.out.println("invalid value");
                break;
        }
scan.close();
        }
    }