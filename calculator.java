public class calculator {

    public static void main(String[] args) {
        test t=new test();
        try{
            t.pause();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("2sec");
        }
        
    }
}

class test{
    void pause() throws InterruptedException{
        System.out.println("sleeping");
        Thread.sleep(2000);
    }
}