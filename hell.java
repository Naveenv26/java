public class hell {

    public static void main(String[] args) {
        book c=new book();
        book b=new book();
        c.title="";
        c.price=2004;
        b.title="vinland";
        b.price=5000;
        c.showdetails();
        b.showdetails();
    }
}

class book{
    String title;
    int price;

    void showdetails(){
        System.out.println(title +" : "+ price);
    }
}

