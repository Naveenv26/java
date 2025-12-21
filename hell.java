import java.util.Scanner;

public class hell {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age =scan.nextInt();
        scan.close();
        if(age<18){
            System.out.println(age+" is less 18");
        }
        else{
            System.out.println(age +"is bigger 18");
        }
        }
    }