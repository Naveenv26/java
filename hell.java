public class Hell {

    public static void main(String[] args) {
        payment pp=new creditcard(5000);
        payment pay=new paypal(2000);
        
        pay.processpayment();
        pay.detais();
        pp.processpayment();
        pp.detais();
    }
}

abstract class payment{
    int Amount;
    payment(int Amount){
        this.Amount=Amount;
    }
    abstract void processpayment();
            
        void detais(){
        System.out.println("Amount : "+ this.Amount);
    
    }
}

class creditcard extends payment{

    creditcard(int Amount){
        super(Amount);
    }
    
    @Override
    void processpayment() {
        System.out.println("card processed");
    }
}

class paypal extends payment{
    paypal(int Amount){
        super(Amount);
    }
    void processpayment(){
        System.out.println("paypal processed");
    }
}