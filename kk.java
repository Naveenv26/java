import java.util.Scanner;

public class kk {
    public static void main(String[] args) {
            int[] age=new int[20];
            Scanner scan=new Scanner(System.in);

            // for (int i=0;i<age.length;i++){
            //     age[i]=scan.nextInt();

            //     if(age[i]==0){
            //         break;
            //     }
                
            // }
            // int sum=0;
            // for(int i=0;i<age.length;i++){
            //     if(age[i]<=0) continue;
            //     else if(age[i]<17){
            //         sum=sum+200;
            //     }
            //     else if (age[i]>17 & age[i]<40){
            //         sum=sum+400;
            //     }
            //     else{
            //         sum=sum+300;
            //     }
            // }

            // System.out.println(sum);
            monkey(20,2,3,12,12);
    }
    public static void monkey(int n,int k, int j, int m, int p){

        //total n=monkey=20 m=banana=12, p=peanut=12 k=banana=2, j=peanut=3
        int l=n-((m/k)+(p/j));
        System.out.println(l);
    }
}
// n*n-1)/2