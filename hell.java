public class hell {

    public static void main(String[] args) {
        bankaccount bank=new bankaccount();
        bankaccount bank1=new bankaccount();
        bank.account=666;
        bank.balance=2000;
        bank.name="naveen";
        bank.display();
        bank.deposit(500);
        bank.display();
        bank1.account=896;
        bank1.balance=1000;
        bank1.name="thors";
        bank1.display();
        bank1.withdraw(6000);
        bank1.display();
        
    }
}

class bankaccount{
    String name;
    int account,balance;

    void deposit(int amount){
        balance= (balance+amount);
    }
    void withdraw(int amount){
        if(balance>=amount){
            balance=balance-amount;
        }
        else{
            System.out.println("insufficient amount");
            System.out.println("-------------****-----------");
        }
        
    }
    void display(){
        System.out.println("holder name :"+name);
        System.out.println("ACC NO :"+account);
        System.out.println("Balance :"+balance);
        System.out.println("------------------------");

    }

}