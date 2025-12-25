public class Hell {

    public static void main(String[] args) {
        int []a=new int[]{1,2,3,4,5};
        int[]b=new int[5];
        int temp,j=0;

        for(int i=a.length-1;i>=0;i--){

            temp=a[i];
            b[j]=temp;
            j=j+1;
                //System.out.println(b[j]);
            }
        
        for(int t=0;t<5;t++){
            System.out.println(b[t]);
        }
    }
}