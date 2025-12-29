public class Hell {

    Hell(){
        //constructor

    }

    public static void main(String[] args) {

        Account a=new Saving(5000);
        a.show();
    }
}

class Account{

    Account(int balance){
        this.balance=balance;
    }
    int balance;
    void show(){
        System.out.println(balance);
    }

}

class Saving extends Account{
    
    Saving(int balance){
        super(balance);
        System.out.println(balance);
        
    }
    
    void show(){
        super.show();
    }
}


