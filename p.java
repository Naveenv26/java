import java.util.HashMap;

public class p {
    public static void main(String[] args) {
        String str="Hello";
        has h=new has();
        h.h();
        char[] c=str.toCharArray();
        Palin p=new Palin();
        p.palindrome();
        int left=0;
        int right=c.length-1;
        char temp;
        while(left<right){
            temp=c[left];
            c[left]=c[right];
            c[right]=temp;

            left++;
            right--;
        }

        System.out.println(new String(c));
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
    
}

class Palin{
    void palindrome(){
        String a="oiu";
        int left=0;
        int right=a.length()-1;
        boolean ab=false;
        while (left<right) {
            if(a.charAt(left)!=a.charAt(right)){
                ab=true;
                // read the logic
                break;
            }
            left ++;
            right--;
        }
        if(ab){
            System.out.println(" is a palindrome");
        }

        else{
            System.out.println("is not a palindrome");
        }

    }

}

class has{
    void h(){
        HashMap <Character,Integer> map=new HashMap<>();

        String h="Hello";
        
        for ( int i=0;i<h.length();i++){
            char ch=h.charAt(i);
            if(map.containsKey(h.charAt(i))){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }
}