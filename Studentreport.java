public class Studentreport {

    public static void main(String[] args) {
        Shape c=new circle(5);
        Shape r=new rect(10, 20);
        System.out.println(c.area());
        System.out.println(r.area());
    }
}

abstract class Shape{

    abstract double area();

}

class rect extends Shape{
    double l,w;
    rect(double l,double w){
        this.l=l;
        this.w=w;
    }
    
    double area(){
        return l*w;
    }
}

class circle extends Shape{
    private double r;
    circle(double r){
        this.r=r;
    }
    double area(){
        return 3.14*r*r;
    }

}