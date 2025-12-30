public class ATM {
    public static void main(String[] args) {
        Atmcard a=new Atmcard(100);
        Cash c=new Cash(50);
        a.checkpin();
        a.pay();
        c.pay();
    }
}

abstract class payment{
    double amount;

    payment(double amount){
        this.amount=amount;
    }
    abstract void pay();
}

interface Secure {
    void checkpin();
}

class Atmcard extends payment implements Secure {

    Atmcard(double amount){
        super(amount);
    }

    void pay(){
        System.out.println("paying with card ");
    }
    public void checkpin() {
        System.out.println("PIN verified");
    }
}

class Cash extends payment{
    Cash(double amount){
        super(amount);
    }
    void pay(){
        System.out.println("paying with cash" );
    }
}