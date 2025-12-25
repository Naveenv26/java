public class Hell {
    static int x;
    int y;
    Hell(){
        x=x+1;
        y=y+1;
        System.out.println(x +"=x : y="+ y);

    }


    public static void main(String[] args) {
        Hell a=new Hell();
        Hell a1=new Hell();

    }
}