import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class todo {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();
        Scanner bb=new Scanner(System.in);
        System.out.println("__ welcome to the todo app __");
        while (true) {
            
            System.out.println("1. ADD task");
            System.out.println("2. show");
            System.out.println("3. Delete");
            System.out.println("4. Exit");
            System.out.print("Enter ur choice :");
            int n=0;
            try {
                n=bb.nextInt();
                bb.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("gg");
                bb.nextLine();
                continue;
                
            }
            
            switch (n) {
                case 1:
                    System.out.print("enter the task : ");
                    String s11=bb.nextLine().trim();
                    if(s11.isEmpty())
                    {
                    System.out.println("** Enter an valid input **");
                    
                    }
                    else{
                        list.add(s11);
                        System.out.println("** The task is added **");
                    }
                    break;
                case 2:
                    int b=0;
                    if(list.size()>0){
                        System.out.println("*---------*");
                        for(String a : list){
                            b++;
                            System.out.println(b +"."+a);
                            
                            
                        }}
                    else{
                        System.out.println("*** Nothing TO SHOW ***");
                    }
                    System.out.println("*---------*");
                    break;
                case 3:
                    System.out.println("which one to delete :");
                    try{
                        int s33=bb.nextInt();
                        bb.nextLine();
                        list.remove(s33-1);
                        System.out.println("removed");
                    }
                    catch(IndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("***enter a valid index | Input ***");
                        bb.nextLine();
                    }
                    break;

                case 4:
                    System.out.println("Exiting....");
                    bb.close();
                    return;
                default:
                    System.out.println("Choose an valid option");
                    break;
            }
        }
    }

}

