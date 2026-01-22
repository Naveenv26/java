public class cal {

    public static void main(String[] args) {
        jer a=new jer();
        a.add(2,5);
    }
}

class jer{
    int a;
    int b;

    void add(int a,int b){
        this.a=a;
        this.b=b;
        

    }

    void add(){
        System.out.println(a+b);
    }
}