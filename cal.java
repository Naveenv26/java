import java.util.HashMap;

public class cal {

    public static void main(String[] args) {
        HashMap<String,Integer> vb=new HashMap<>();
        vb.put("apple", 50);
        vb.put("bamama", 30);

        if(vb.containsKey("mango")){
            int a=vb.get("mango");
            System.out.println("mango stock is : "+a);
        }
        else{
            System.out.println("mango out of stock");
        }

        if (vb.containsKey("apple")){
            int b=vb.get("apple");
            System.out.println("apple's stock is : "+b);
        }
        else{
            System.out.println("apple out of stock");
        }
    }
}