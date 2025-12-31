public class calculator {
    public static void main(String[] args) {

        voting vote=new voting();
        try{
            vote.checkage(1);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("--*--");
        }
        

    }
}

class voting{
    void checkage(int age){
        if (age<18){
            throw new ArithmeticException("Access denied");
        }
        else{
            System.out.println("eligible to vote");
        }
}
}

