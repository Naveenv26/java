public class Hell {
    int len,bre;

    Hell(int len,int bre){
        this.len=len;
        this.bre=bre;
    }
    void display(){
        System.out.println("area of rectangle : "+len*bre);

    }

    public static void main(String[] args) {
        Hell a=new Hell(10,5);
        a.display();

    }
}