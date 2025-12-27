public class bank {
    int account;
    String name;
    static int count;
    private int balance;

    int getbalance(){
        return balance;
    }
    bank(int account){
        count++;
        this.account=account;
        this.name="Unknown";
        this.balance=0;

    }

    bank(int account,String name){
        count+=1;
        this.account=account;
        this.balance=0;
        this.name=name;

    }

    bank(int account,String name,int balance){
        count=count+1;
        this.account=account;
        this.balance=balance;
        this.name=name;
    }

    void deposit(int amount){
        System.out.println("Deposit : "+amount);
        balance=balance+amount;
        System.out.println("Updated Balance : "+getbalance());
        System.out.println("------------************-------------");
    }

    void withdraw(int amount){
        System.out.println("Withdraw : "+amount);
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("updated balance : "+getbalance());
            System.out.println("------------************-------------");
        }
        else{
            System.out.println("------------************-------------");
            System.out.println(" Insufficient amount ");
            System.out.println("------------************-------------");
        }
    }

    void display(){
        System.out.println("Account number : "+account);
        System.out.println("Name : "+name);
        System.out.println("balance : "+getbalance());
    }

    public static void main(String[] args) {
        bank b=new bank(101,"Naveen",5000);
        bank b1=new bank(102,"Arun");
        bank b2=new bank(103);
        b.display();
        b.deposit(5000);
        b.withdraw(10000);
        
        b1.display();
        b1.deposit(7900);
        b1.withdraw(7000);
        b2.display();

        System.out.println("Total account:"+count);
    }
}
