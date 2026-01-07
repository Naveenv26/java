public class Hell {

    public static void main(String[] args) {
        math a=new math(20);
        math b=new math(10.5);
    }
}

class math<T extends Number>{
    T num;
    math(T num){
        this.num=num;
    }

    double square(){
        
        return num.doubleValue();
    }
}