public class Mart {

    public static void main(String[] args) {
        Electronics e=new Electronics(101, "wire", 20,2);
        Cloths c=new Cloths(201, "T-Shirt", 299, "M",5);
        e.Display();
        c.Display();

    }
}

interface Discount{
    double calculatediscount(double percentage);
}


abstract class Product implements Discount{
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    abstract void Display();

    int id(){
        return id;
    }
    String name(){
        return name;
    }
    double price(){
        return price;
    }

    @Override
    public double calculatediscount(double percentage) {
        return price-(price*percentage/100);
    }
}

class Electronics extends Product{
    int Warrenty;

    Electronics(int id,String name,double price,int Warrenty){
        super(id, name, price);
        this.Warrenty=Warrenty;
    }

    @Override
    public void Display(){
        System.out.println("Name : "+name());
        System.out.println("Price : "+price());
        System.out.println("Warrenty(months) : "+Warrenty);
    }
}

class Cloths extends Product{
    String size;
    double percentage;
    Cloths(int id,String name,double price,String size,double percentage){
        super(id,name,price);
        this.size=size;
        this.percentage=percentage;
    }


    @Override
    void Display() {
        System.out.println("Name : "+name());
        System.out.println("Price : "+price());
        System.out.println("Price after Discount : "+calculatediscount(percentage));
        System.out.println("Size : "+size);
    }
}