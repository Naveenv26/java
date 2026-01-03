import java.util.ArrayList;

public class Mart {

    public static void main(String[] args) {
        Electronics e=new Electronics(101, "wire", 20,2,10);
        Cloths c=new Cloths(201, "T-Shirt", 299, "M",5,50);
        e.display();
        c.display();
        


        user u=new user(200, "rag ");
        
        try {
            u.addtocart(c);
            u.addtocart(e);
        } 
        catch (outofstockException h) {
            System.out.println(h);
        }
        
        u.calculatetotal();
        u.checkout( new Credit() );
    }
}

interface Discount{
    double calculatediscount(double percentage);
}


abstract class Product implements Discount{
    private int id;
    private String name;
    private double price;
    
    int stock;

    Product(int id, String name, double price, int stock){
        this.id=id;
        this.name=name;
        this.price=price;
        
        this.stock=stock;
    }
    abstract void display();
    
    int id(){
        return id;
    }
    String name(){
        return name;
    }
    
    
    double price(){
        return price;
    }
    double price(double percentage){
        return calculatediscount(percentage);
    }

    @Override
    public double calculatediscount(double percentage) {
        return price-(price*percentage/100);
    }
}

class Electronics extends Product{
    int Warrenty;
    int percentage;
    Electronics(int id,String name,double price,int Warrenty,int stock){
        super(id, name, price,stock);
        this.Warrenty=Warrenty;
    }
        @Override
    double price() {
    return calculatediscount(percentage);
    }

    @Override
    public void display(){
        System.out.println("Name : "+name());
        System.out.println("Price : "+price());
        System.out.println("Warrenty(months) : "+Warrenty);
    }
}

class Cloths extends Product{
    String size;
    double percentage;
    Cloths(int id,String name,double price,String size,double percentage,int stock){
        super(id,name,price,stock);
        this.size=size;
        this.percentage=percentage;
    }

    // Inside class Cloths
    @Override
    double price() {
    return calculatediscount(percentage);
    }


    @Override
    void display() {
        System.out.println("Name : "+name());
        System.out.println("Price : "+price());
        System.out.println("Size : "+size);
    }
}

class user{
    int userid;
    String username;
    ArrayList<Product> cart=new ArrayList<>();

    user(int userid,String username){
        this.userid=userid;
        this.username=username;
        
    }

    void addtocart(Product p) throws outofstockException{
        
        if(p.stock>0){
            cart.add(p);
            p.stock=p.stock-1;
        }
        else{
            throw new outofstockException();
        }
        System.out.println("product Added "+p);
    }

    double calculatetotal(){
        double sum=0;
        for(Product p: cart){
            sum=p.price()+sum;
        }
        return sum;
    }

    void checkout(paymentmethod pm){
        double Total=calculatetotal();
        System.out.println("Total amount :"+Total);
        pm.pay(Total);
        cart.clear();
        System.out.println("Order placed");
    }
}

class outofstockException extends Exception{}


interface paymentmethod{
    void pay(double amount);
}

class Credit implements paymentmethod{

    @Override
    public void pay(double amount) {
        System.out.println("amount : "+ amount+"paid via credid card");
    }
}

class UPI implements paymentmethod{

    @Override
    public void pay(double amount) {
        System.out.println("amount :"+amount+" paid via UPI");
    }
}