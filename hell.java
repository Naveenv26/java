public class Hell {


    public static void main(String[] args) {//adding array nums
        int sum=0;
        int[]a=new int[]{5,10,15,20};
        for(int i=0;i<(a.length);i++){
            sum=a[i]+sum;
        }
        System.out.println(sum);
    }
    }
