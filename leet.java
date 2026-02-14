public class leet {
    public static void main(String[] args) {
        int a[]={2,7,11,9};
        int target=9;
        int l=0;
        int r=a.length-1;
        while(l<r){
            int sum=a[l]+a[r];
            if(sum>target){
                r--;
            }
            else if(sum==target){
                System.out.println(l+" - "+r);
                l++;
                r--;
            }
            else{
                l++;

            }
        }


    }
}



