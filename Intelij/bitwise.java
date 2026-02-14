public class bitwise {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(n*(n+1)/2);
    }
import java.util.*;
import java.lang.*;
import java.io.*;

    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner scan =new Scanner(System.in);
            int T=scan.nextInt();
            while(T -- >0){
                int n=scan.nextInt();
                int x=scan.nextInt();
                int a=n%6;
                System.out.println(a>1? a*x : x);
            }

        }
    }



}
//    static void table(int n, int i) {
//
//
//        if (n <= 0) {
//            System.out.println("Zero");
//            return;
//        } else if (i == 11) {
//            return;
//        }
//        else {
//            System.out.println(i + " * " + n + " = " + i * n);
//        }
//        table(n,i+1);
//    }
//}