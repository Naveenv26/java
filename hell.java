public class Hell {

    public static void main(String[] args) {
        Storage<Integer> a=new Storage<>(20);
        Storage<String> b=new Storage<>("alakazam");
        a.display();
        b.display();
    }
}

class Storage<T>{
    T item;

    Storage(T item){
        this.item=item;
    }
    void display(){
        System.out.println(item);
    }
}