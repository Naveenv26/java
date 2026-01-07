public class cal {

    public static void main(String[] args) {
        account a=new account("name",202);
        a.display();
        a.deposit(150);
        a.display();
        a.withdraw(50);
        a.display();
    }
}

abstract class users{
    String name;
    int accountno;
    private double price;

    users(String name,int accountno){
        this.name=name;
        this.accountno=accountno;
    }

    public double getPrice() {
        return price;
    }
    void setPrice(double price){
        this.price=price;
    }
    abstract void display();
}

class account extends users{
    account(String name,int accountno){
        super(name, accountno);

    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Account no : "+accountno);
        System.out.println("current balance : "+getPrice());
    }
    double amot;
    void deposit(double amt){
        if(amt>0){
            amot=getPrice()+amt;
            setPrice(amot);
        }
        else{
            System.out.println("-ve number is not possible");
        }
    }

    void withdraw(double amt){

        if (amt <=getPrice()){
            amot=getPrice()-amt;
            setPrice(amot);
        }
        else{
            System.out.println("invalid amount");
        }
    }

}

