public class Hell {

    Hell(){
        //constructor

    }

    public static void main(String[] args) {
        child s=new child();
        s.display();
    }
}

class Parent{
    void display(){
        System.out.println("parent constructor called");
    }
}

class child extends Parent{
    void display(){
        System.out.println("orewa child uu");
    }
    

}



