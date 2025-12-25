public class Hell {


    public static void main(String[] args) {
        
        int []a=new int[]{10,20,30,40,50};
        
        for(int ele :a){//Enhanced for loop
            System.out.println(ele);
        }
        for(int i=0;i<(a.length);i++){//normal for loop
            System.out.println("---"+a[i]);
        }
    }
    }
