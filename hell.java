public class Hell {


    public static void main(String[] args) {//adding array nums
        int temp;
        int[]a=new int[]{12,45,7,89,23};
        for(int i=0;i<(a.length);i++){
            for(int j=i;j<(a.length-1);j++){
                System.out.println(a[i]+"--"+a[j+1]);
                if(a[i]>a[j+1]){
                    temp=a[i];
                    a[i]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("Maximum value : "+a[a.length-1]);
    }
    }
