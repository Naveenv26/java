public class Hell {


    public static void main(String[] args) {//adding array nums
        
        int[]a=new int[]{12,45,7,89,23};
        int max=a[0];
        for(int i=1;i<(a.length);i++){
            if(a[i]>max){
                max=a[i];

            }
        }
        System.out.print("Maximum value : "+max);
    }
    }
