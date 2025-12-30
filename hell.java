public class Hell {

    public static void main(String[] args) {
        smartphone s=new smartphone("apple");
        s.turnon();
        s.takephoto();
        s.playsong();
    }
}

abstract class Device{
    String name;
    Device(String name){
        this.name=name;
    }
    abstract void turnon();
}

interface camera{
    void takephoto();
}

interface musicplayer {

    void playsong();
}

class smartphone extends Device implements camera ,musicplayer{
    smartphone(String name){
        super(name);
        
    }
    void turnon(){
        System.out.println("Device turing ON ");
        System.out.println("WELCOME TO "+name);
    }
    public void takephoto(){
        System.out.println("photo taken");
    }
    
    public void playsong(){
        System.out.println("playing song");
    }
    }
