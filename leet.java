import java.util.LinkedList;

public class leet {
    public static void main(String[] args) {
        LinkedList <Integer> l1= new LinkedList<>();
        l1.add(3);
        l1.add(2);
        l1.add(1);
        LinkedList <Integer> l2= new LinkedList<>();
        l2.add(6);
        l2.add(5);
        l2.add(7);
        int sum=0;

        int temp=0;
        for(int x : l1){
            temp=(temp)*10+x;
        }
        System.out.println(temp);
        int val1=reverse(temp);
        int temp1=0;
        for(int x : l2){
            temp1=(temp1)*10+x;
        }
        System.out.println(temp1);
        int val2=reverse(temp1);

        sum=val1+val2;
        System.out.println(sum);
        System.out.println(reverse(sum));
    }



    public static int reverse(int temp){
        int val=0;
        int a=0;

        while (temp!=0){
            a=temp%10;
            val=(val*10)+a;
            temp=temp/10;
        }
        System.out.println(val);


        return val;
    }

}








