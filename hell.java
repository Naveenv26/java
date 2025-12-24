import java.util.Scanner;
public class hell {

        String name;
        int age;

        void display(String name,int age){
            System.out.print(name +':'+ age);

        }
            
    
    public static void main(String[] args) {
        hell val =new hell();

        Scanner scan=new Scanner(System.in);
        System.out.print("enter how many set :");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            scan.nextLine();
            val.name=scan.nextLine();
            val.age=scan.nextInt();
        val.display(val.name,val.age);
        }
        
        
        scan.close();
    }
}